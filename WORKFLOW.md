# 📋 Hướng dẫn Git & GitHub - Cho sinh viên

Hướng dẫn nhanh cách sử dụng Git để submit bài tập.

---

## 🔄 Workflow cơ bản

```
1. Clone repo
2. Tạo branch riêng
3. Sửa code
4. Commit
5. Push
6. Tạo Pull Request (submit)
```

---

## 📝 Các lệnh cần biết

### **Clone project**
```bash
git clone https://github.com/Group-5-pro192/Abstract-demo.git
cd Abstract_demo
```

### **Tạo branch mới (cho mỗi bài tập)**
```bash
git checkout -b feature/your-name-student-id
# Ví dụ: feature/nguyen-van-a-20200123
```

### **Xem status**
```bash
git status
```

### **Thêm file và commit**
```bash
git add .
git commit -m "feat: your changes description"
# Ví dụ: git commit -m "feat: implement Dog class"
```

### **Push lên GitHub**
```bash
git push origin feature/your-name-student-id
```

### **Cập nhật code mới nhất**
```bash
git pull origin main
```

---

## 🎯 Quy trình submit bài tập

### **Bước 1: Fork repository**
- Truy cập: https://github.com/Group-5-pro192/Abstract-demo
- Click nút **"Fork"** (góc trên phải)
- Sẽ tạo bản copy riêng cho bạn

### **Bước 2: Clone fork của bạn**
```bash
git clone https://github.com/YOUR-USERNAME/Abstract-demo.git
cd Abstract_demo
```

### **Bước 3: Tạo feature branch**
```bash
git checkout -b feature/name-studentid
# Ví dụ: feature/huynh-20200001
```

### **Bước 4: Sửa code**
- Mở project trong NetBeans
- Sửa file trong thư mục `src/`
- Test chạy được không (Ctrl+F11, F6)

### **Bước 5: Commit & Push**
```bash
git add .
git commit -m "feat: description of your changes"
git push origin feature/name-studentid
```

### **Bước 6: Tạo Pull Request**
1. Truy cập fork của bạn: `https://github.com/YOUR-USERNAME/Abstract-demo`
2. Click **"Compare & pull request"** (nếu có) hoặc **"New pull request"**
3. Điền thông tin:
   - **Title:** `[SUBMIT] Your Name - Student ID`
   - **Description:** Mô tả bài làm của bạn (1-2 dòng)
4. Click **"Create pull request"**

✅ **Xong! Giảng viên sẽ review bài của bạn**

---

## 💡 Commit message hướng dẫn

**Tốt ✅:**
```
feat: implement Dog class extending Animal
feat: add makeSound() method
fix: fix NullPointerException in main
docs: add class comments
```

**Không tốt ❌:**
```
fix bug
update
change
haha
```

---

## ❌ Lỗi thường gặp & cách sửa

### **Lỗi 1: "Permission denied when pushing"**

**Nguyên nhân:** Chưa setup GitHub authentication

**Sửa:**
```bash
# Tạo Personal Access Token: https://github.com/settings/tokens
# Chọn scope "repo"

# Sau đó:
git remote set-url origin https://YOUR-USERNAME:YOUR-TOKEN@github.com/YOUR-USERNAME/Abstract-demo.git
git push origin feature/your-branch
```

### **Lỗi 2: "Merge conflict"**

**Nguyên nhân:** Code bị trùng lặp hoặc xung đột

**Sửa:**
```bash
# Update code mới nhất
git fetch origin
git rebase origin/main

# Sửa file conflict trong editor
# Rồi:
git add .
git rebase --continue
git push origin feature/your-branch --force-with-lease
```

### **Lỗi 3: "Pushed to wrong branch"**

**Sửa:**
```bash
# Tạo branch đúng
git checkout -b feature/correct-name

# Push lên GitHub
git push origin feature/correct-name

# Đóng PR sai
# (và tạo PR mới từ branch đúng)
```

---

## 📖 Khái niệm cơ bản

| Khái niệm | Ý nghĩa |
|-----------|---------|
| **Repository** | Kho chứa code |
| **Fork** | Tạo bản copy riêng |
| **Clone** | Tải code về máy |
| **Branch** | Nhánh phát triển riêng |
| **Commit** | Lưu thay đổi |
| **Push** | Đẩy lên GitHub |
| **Pull Request** | Đề xuất hợp nhất code |

---

## 🎓 Tài liệu thêm

- [Pro Git Book](https://git-scm.com/book/en/v2) - Sách về Git
- [GitHub Guides](https://guides.github.com/) - Hướng dẫn GitHub
- [Atlassian Git Tutorial](https://www.atlassian.com/git/tutorials) - Bài hướng dẫn Git

---

## ❓ Cần giúp?

1. Xem [README.md](README.md) để hiểu project
2. Kiểm tra [SETUP.md](SETUP.md) để cài đặt
3. Tạo Issue: https://github.com/Group-5-pro192/Abstract-demo/issues
4. Hỏi giảng viên trong lớp

---

**Chúc bạn thành công! 🚀**
