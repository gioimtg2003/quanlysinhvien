import random
Họ = ["Nguyen", "Pham", "Tran", "Ho", "Dinh", "Phan"]
Lót = ["Cong", "Thi", "Van", "Hoang", "Tan"]
Tên = ["Duc", "Hai", "Ha", "Anh", "Tuan", "Thien",
       "Trang", "Dat", "Thanh", "Huy", "Minh", "Gioi", "Phat"]
tỉnh = ["An Giang", "Bac Giang", "Bac Ninh", "Ben Tre", "Binh Dinh", "Quang Ngai",
        "Tp HCM", "Binh Thuan", "Ha Noi",  "Khanh Hoa", "Phu Yen", "Binh Duong"]
ngành = ["TT", "KT", "QT", "VT"]
khoa = ["KTHK", "DDT", "QTKD",]
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
    with open("C:\\code java\\qlysinhvien\\src\\model\\data\\students.txt", "a", encoding="utf-8") as f:
        f.write(name + "_" + birthDay+"_"+str(random.choice(gtinh)) + "_" + random.choice(tỉnh) +"_" + idStudent+"_" + className + "_" + random.choice(khoa) + "_" + phone + "\n")
    # with open("data.txt", "utf-8", "a") as f:
    #     f.write(name + "_" + birthDay+"_"+str(random.choice(gtinh)) + "_" + random.choice(tỉnh) +"_" + idStudent+"_" + className + "_" + random.choice(khoa) + "_" + phone + "\n")
