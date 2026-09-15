package abstract_demo;

import java.util.ArrayList;
import java.util.List;

// ============================================================================
// 1. INTERFACES (Năng lực bổ trợ - "CAN-DO")
// ============================================================================
interface Refundable {

    double MAX_REFUND_LIMIT = 5000.0; // Hằng số (public static final)

    boolean processRefund(double refundAmount); // Abstract method
}

interface Promotable {

    void applyVoucher(String voucherCode);

    // Default method (Java 8 trở lên)
    default void showPromotionNotice() {
        System.out.println("   [PROMO NOTICE] Giao dịch đủ điều kiện tích điểm thưởng!");
    }
}

// ============================================================================
// 2. ABSTRACT CLASS (Bản chất chung - "IS-A")
// ============================================================================
abstract class Payment {

    private String transactionId; // Encapsulated Field
    private double amount;

    // Constructor của Abstract Class
    public Payment(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    // Concrete Method: Logic dùng chung
    public void logTransaction() {
        System.out.println("-> [LOG] TxID: " + transactionId + " | Amount: $" + amount);
    }

    // Abstract Method: Bắt buộc các lớp con phải triển khai logic riêng
    public abstract void processPayment();
}

// ============================================================================
// 3. CONCRETE SUBCLASSES (Triển khai thực tế)
// ============================================================================
// Lớp 1: Thanh toán thẻ tín dụng (Kế thừa Payment, Triển khai Refundable & Promotable)
class CreditCardPayment extends Payment implements Refundable, Promotable {

    private String cardNumber;

    public CreditCardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        String maskedCard = "****" + cardNumber.substring(cardNumber.length() - 4);
        System.out.println("[Thẻ Tín Dụng] Đang xác thực thẻ " + maskedCard
                + " | Trừ số tiền: $" + getAmount());
    }

    @Override
    public boolean processRefund(double refundAmount) {
        if (refundAmount <= getAmount() && refundAmount <= MAX_REFUND_LIMIT) {
            System.out.println("   [Hoàn Tiền Thẻ] Đã hoàn $" + refundAmount
                    + " về lại thẻ " + cardNumber);
            return true;
        }
        System.out.println("   [Lỗi Hoàn Tiền] Số tiền hoàn vượt quá giới hạn cho phép!");
        return false;
    }

    @Override
    public void applyVoucher(String voucherCode) {
        System.out.println("   [Voucher Thẻ] Đã áp dụng mã " + voucherCode
                + " (Giảm 10% phí giao dịch).");
    }
}

// Lớp 2: Thanh toán Ví Điện Tử (Kế thừa Payment, Triển khai Promotable)
class EWalletPayment extends Payment implements Promotable {

    private String phoneNumber;

    public EWalletPayment(String transactionId, double amount, String phoneNumber) {
        super(transactionId, amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("[Ví Điện Tử] Gửi thông báo tới OTP số " + phoneNumber
                + " | Trừ ví: $" + getAmount());
    }

    @Override
    public void applyVoucher(String voucherCode) {
        System.out.println("   [Voucher Ví] Đã áp dụng mã " + voucherCode
                + " (Hoàn 5% MoMo Coin).");
    }
}

// Lớp 3: Thanh toán Tiền Mặt (Chỉ kế thừa Payment)
class CashOnDeliveryPayment extends Payment {

    private String shippingAddress;

    public CashOnDeliveryPayment(String transactionId, double amount, String shippingAddress) {
        super(transactionId, amount);
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void processPayment() {
        System.out.println("[Tiền Mặt COD] Shipper sẽ thu $" + getAmount()
                + " tại địa chỉ: " + shippingAddress);
    }
}

// ============================================================================
// 4. MAIN CLASS (Lớp chính để chạy Demo trong NetBeans)
// ============================================================================
public class AbstractInterfaceDemo {

    public static void main(String[] args) {
        System.out.println("========== HỆ THỐNG QUẢN LÝ THANH TOÁN (NETBEANS DEMO) ==========\n");

        // 1. UPCASTING & ĐA HÌNH (Polymorphism)
        // Tạo danh sách quản lý bằng biến kiểu lớp cha Payment
        List<Payment> paymentList = new ArrayList<>();

        paymentList.add(new CreditCardPayment("TXN-101", 1200.0, "4111222233334444"));
        paymentList.add(new EWalletPayment("TXN-102", 350.0, "0987654321"));
        paymentList.add(new CashOnDeliveryPayment("TXN-103", 80.0, "123 Nguyen Hue, Q1, HCM"));

        // 2. DUYỆT DANH SÁCH & THỰC THI ĐA HÌNH
        int index = 1;
        for (Payment p : paymentList) {
            System.out.println("--- Giao Dịch #" + (index++) + " ---");
            p.logTransaction();      // Gọi phương thức concrete của lớp cha
            p.processPayment();    // Đa hình: Tự động chạy logic đúng của từng lớp con

            // 3. KIỂM TRA ĐA THỪA KẾ INTERFACE & SAFE DOWNCASTING WITH 'instanceof'
            // Kiểm tra khả năng nhận Voucher
            if (p instanceof Promotable) {
                Promotable promo = (Promotable) p; // Safe Downcasting
                promo.applyVoucher("PRO192_SUMMER");
                promo.showPromotionNotice(); // Gọi default method
            }

            // Kiểm tra khả năng Hoàn Tiền
            if (p instanceof Refundable) {
                Refundable ref = (Refundable) p; // Safe Downcasting
                ref.processRefund(p.getAmount());
            } else {
                System.out.println("   [Thông Báo] Hình thức thanh toán này không hỗ trợ hoàn tiền Online!");
            }
            System.out.println();
        }

        System.out.println("================ BUILD SUCCESSFUL ================");
    }
}
