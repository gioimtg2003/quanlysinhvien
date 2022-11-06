package model;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

public class searchStudents {
    private String idStudent;
    private String khoa;
    private File file = new File("C:\\code java\\qlysinhvien\\src\\model\\data\\students.txt");
    private FileReader fr ;
    private BufferedReader br;

    public searchStudents(String idStudent, String khoa) throws java.io.IOException {
        this.idStudent = idStudent;
        this.khoa = khoa;
        fr = new FileReader(file);
        br = new BufferedReader(fr);
    }

    public ArrayList<String> searchStudentByClassName() throws java.io.IOException {
        ArrayList<String> listStudent = new ArrayList<String>();
        String line = br.readLine();
        while (line != null && line != "") {
            if (line.contains(idStudent)) {
                listStudent.add(line);
            }
            line = br.readLine();
        }
        return listStudent;
    }

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
    // public static void main(String[] args) throws java.io.IOException {
    // searchStudents a = new searchStudents("1", "2222");
    // ArrayList<String> listStudentById = new ArrayList<String>();
    // listStudentById = a.searchStudentByID();
    // if (listStudentById.size() > 0) {
    // for (int i = 0; i < listStudentById.size(); i++) {
    // System.out.println(listStudentById.get(i).split("_")[0]);
    // }
    // } else {
    // System.out.println("Không tìm thấy sinh viên");
    // }
    // }
}
