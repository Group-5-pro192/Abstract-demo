package abstract_demo;

// INTERFACE 2: Defines bonus calculation capability
public interface BonusCalculable {
    double BONUS_RATE = 0.15; // implicitly public static final

    double calculateBonus(double salary);
}
