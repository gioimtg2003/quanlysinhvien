package model;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class searchStudents {
    private String className;
    private String khoa;
    private FileReader fr;
    private BufferedReader br;

    // hàm tạo với đầu vào là tên lớp và tên khoa
    public searchStudents(String className, String khoa) throws java.io.IOException {
        this.className = className;
        this.khoa = khoa;
        fr = new FileReader(student.file);
        br = new BufferedReader(fr);
    }

    // hàm tìm kiếm sinh viên theo tên lớp. Kiểu trả về là ArrayList mỗi phần tử
    // chứa tất cả thông tin của sinh viên
    public ArrayList<String> searchStudentByClassName() throws java.io.IOException {
        ArrayList<String> listStudent = new ArrayList<String>();
        String line = br.readLine();
        while (line != null && line != "") {
            if (line.contains(className)) {
                listStudent.add(line);
            }
            line = br.readLine();
        }
        return listStudent;
    }

    // hàm tìm kiếm theo tên khoa kiểu trả về là ArrayList mỗi phần tử chứa tất cả
    // thông tin của sinh viên
    public ArrayList<String> searchStudentByFaculty() throws java.io.IOException {
        ArrayList<String> listStudent = new ArrayList<String>();
        String line = br.readLine();
        while (line != null && line != "") {
            if (line.contains(khoa)) {
                listStudent.add(line);
            }
            line = br.readLine();
        }
        return listStudent;
    }

}
