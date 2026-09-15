# 📚 Abstract-demo - Demo dạo học PRO192

Đây là project demo cho bài giảng **Lập trình hướng đối tượng (OOP)** - lớp PRO192.

## 🎯 Nội dung demo

Project này minh họa các khái niệm:
- 📌 **Abstract Class**
- 📌 **Interface**
- 📌 **Polymorphism**
- 📌 **Inheritance**

---

## 🚀 Cách sử dụng

### **1️⃣ Clone project**

```bash
git clone https://github.com/Group-5-pro192/Abstract-demo.git
cd Abstract_demo
```

### **2️⃣ Mở trong NetBeans**

1. Mở **NetBeans IDE**
2. **File → Open Project**
3. Chọn thư mục `Abstract_demo`
4. Click **Open**

### **3️⃣ Chạy demo**

- **Build:** Ctrl+F11 (Build → Build Project)
- **Run:** F6 (Run → Run Project)

Hoặc sử dụng terminal:
```bash
ant build
ant run
```

---

## 📂 Cấu trúc thư mục

```
Abstract_demo/
├── src/                  # Source code
│   └── abstract_demo/    # Package chính
│       ├── Main.java     # Program entry point
│       ├── Animal.java   # Abstract class
│       └── ...
├── build/               # Compiled files (auto-generated)
├── dist/                # JAR file (auto-generated)
└── build.xml            # Build configuration
```

---

## 💡 Khái niệm chính

### **Abstract Class (Lớp trừu tượng)**

Lớp không thể tạo instance trực tiếp. Dùng để định nghĩa cấu trúc chung cho các lớp con.

```java
abstract class Animal {
    abstract void makeSound();  // Method trừu tượng - phải override
    
    void eat() {  // Method thường - không bắt buộc override
        System.out.println("Eating...");
    }
}
```

### **Polymorphism (Tính đa hình)**

Cùng một method nhưng có hành vi khác nhau tùy theo class.

```java
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
```

### **Sử dụng**

```java
Animal dog = new Dog();
Animal cat = new Cat();

dog.makeSound();  // Output: Woof!
cat.makeSound();  // Output: Meow!
```

---

## 📝 Điểm danh / Submit

**Hãy fork repo này và tạo Pull Request để submit bài làm của bạn!**

### **Hướng dẫn submit:**

1. **Fork repository**
   - Click nút **"Fork"** (góc trên phải)

2. **Clone fork của bạn**
   ```bash
   git clone https://github.com/YOUR-USERNAME/Abstract-demo.git
   cd Abstract_demo
   ```

3. **Tạo feature branch**
   ```bash
   git checkout -b feature/your-name-student-id
   ```

4. **Làm bài tập (sửa code trong `src/`)**
   - Thêm class mới hoặc modify existing code
   - Commit changes: `git commit -m "feat: your changes"`

5. **Push lên GitHub**
   ```bash
   git push origin feature/your-name-student-id
   ```

6. **Tạo Pull Request**
   - Truy cập GitHub fork của bạn
   - Click **"New Pull Request"**
   - Điền tiêu đề: `[SUBMIT] Your Name - Student ID`
   - Điền description: Mô tả những gì bạn đã làm
   - Click **"Create Pull Request"**

---

## ❓ Câu hỏi thường gặp

**Q: Project chưa chạy được?**
- A: Kiểm tra đã cài JDK chưa. Xem [SETUP.md](SETUP.md)

**Q: Làm sao để pull code mới nhất?**
- A: `git pull origin main`

**Q: Tôi làm nhầm branch, sao bây giờ?**
- A: `git checkout -b feature/correct-name` và commit lại

**Q: Cần giúp với Git?**
- A: Xem [WORKFLOW.md](WORKFLOW.md)

---

## 📞 Liên hệ

- 📧 Email giảng viên: [teacher@school.edu]
- 💬 GitHub Issues: https://github.com/Group-5-pro192/Abstract-demo/issues
- 📚 Tài liệu: [Xem thêm](SETUP.md)

---

**Chúc các bạn học tốt! 🎉**
