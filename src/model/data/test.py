import random
Họ = ["Nguyễn", "Phạm", "Trần", "Hồ", "Đinh", "Phan"]
Lót = ["Công", "Thị", "Văn", "Hoàng", "Tấn"]
Tên = ["Đức", "Hải", "Hà", "Anh", "Tuấn", "Thiên",
       "Trang", "Đạt", "Thành", "Huy", "Minh", "Giới"]
tỉnh = ["An Giang", "Bắc Giang", "Bắc Kạn", "Bến Tre", "Bình Định", "Quảng Ngãi",
        "Bình Dương", "Bình Thuận", "Hà Nội", "Sài Gòn", "Khánh Hòa", "Phú Yên"]
ngành = ["TT", "KT", "QT", "NA", "TD", "VT"]
khoa = ["KTHK", "DDT", "QTKD"]
gtinh = ["male", "female"]
for i in range(1000):
    khóa = str(random.randint(16, 22))
    birthDay = str(random.randint(1, 30)) + "/" + \
        str(random.randint(1, 12)) + "/" + str(random.randint(1995, 2004))
    idStudent = khóa + "548" + \
        str(random.randint(10000, 99999))
    className = khóa + "DH" + \
        random.choice(ngành) + "0" + str(random.randint(1, 4))
    name = random.choice(Họ) + " " + random.choice(Lót) + \
        " " + random.choice(Tên)
    phone = "036" + str(random.randint(5000000, 9999999))
    #write to file
    with open("C:\\code java\\qlysinhvien\\src\\model\\data\\students2.txt", "a", encoding="utf-8") as f:
        f.write(name + "_" + birthDay+"_"+str(random.choice(gtinh)) + "_" + random.choice(tỉnh) +"_" + idStudent+"_" + className + "_" + random.choice(khoa) + "_" + phone + "\n")
    # with open("data.txt", "utf-8", "a") as f:
    #     f.write(name + "_" + birthDay+"_"+str(random.choice(gtinh)) + "_" + random.choice(tỉnh) +"_" + idStudent+"_" + className + "_" + random.choice(khoa) + "_" + phone + "\n")
