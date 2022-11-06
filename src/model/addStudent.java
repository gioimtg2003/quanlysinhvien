package model;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class addStudent {
    public final static void add(String name, String birthDay, String gtinh, String address, String studentId,
            String className, String Khoa, String phoneNumber) throws java.io.IOException {
        File file = new File("C:\\code java\\qlysinhvien\\src\\model\\data\\students.txt");
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);

        fw.write(name + "_" + birthDay + "_" + gtinh + "_" + address + "_" + studentId + "_" + className + "_" + Khoa
                + "_" + phoneNumber);
        bw.newLine();
        bw.close();

    }

}