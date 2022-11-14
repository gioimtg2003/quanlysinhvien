package model;

import java.io.FileWriter;
import java.io.BufferedWriter;

public class addStudent {
    //thêm các thuộc tính của sinh viên vào file
    public static void add(String name, String birthDay, String gtinh, String address, String studentId,
            String className, String Khoa, String phoneNumber) throws java.io.IOException {
        FileWriter fw = new FileWriter(student.file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        fw.write(name + "_" + birthDay + "_" + gtinh + "_" + address + "_" + studentId + "_" + className + "_" + Khoa
                + "_" + phoneNumber);
        bw.newLine();
        bw.close();

    }

}