# 🛠️ Hướng dẫn cài đặt nhanh

Theo dõi hướng dẫn này để cài đặt môi trường và chạy project.

---

## ✅ Yêu cầu

- **Java JDK 11+** - [Tải tại đây](https://www.oracle.com/java/technologies/downloads/)
- **Git** - [Tải tại đây](https://git-scm.com/download)
- **NetBeans IDE** - [Tải tại đây](https://netbeans.apache.org/download/)

---

## 📥 Cài đặt

### **1. Clone project**

```bash
git clone https://github.com/Group-5-pro192/Abstract-demo.git
cd Abstract_demo
```

### **2. Mở trong NetBeans**

```
File → Open Project → Chọn thư mục Abstract_demo → Open
```

### **3. Build & Run**

```bash
# Cách 1: NetBeans
Build: Ctrl+F11
Run: F6

# Cách 2: Terminal
ant build
ant run
```

---

## 🐛 Gặp lỗi?

### **Lỗi: "javac: command not found"**
→ Chưa cài Java. Tải JDK tại: https://www.oracle.com/java/technologies/downloads/

### **Lỗi: "ant: command not found"**
→ Cài Ant:
```bash
# macOS
brew install ant

# Windows: Tải tại https://ant.apache.org/bindownload.cgi

# Linux
sudo apt-get install ant
```

### **NetBeans không tìm thấy JDK**
→ Tools → Options → Java → Thiết lập JDK path

---

## 📚 Tài liệu thêm

- [README.md](README.md) - Giới thiệu project
- [WORKFLOW.md](WORKFLOW.md) - Hướng dẫn Git
- [Java Documentation](https://docs.oracle.com/javase/tutorial/)

---

**Hoàn tất! Bây giờ bạn có thể chạy project. 🚀**
