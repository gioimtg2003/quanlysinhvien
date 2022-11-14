package view;

import model.searchStudents;
import model.student;
import java.util.ArrayList;
import java.util.Scanner;

public class optionSearch {
    private student[] student;
    private int option;
    private static java.util.Scanner sc = new Scanner(System.in);

    public optionSearch(int option) throws java.io.IOException {
        this.option = option;
        if (this.option == 1) {
            searchByClassName();
        } else if (this.option != 1) {
            searchByKhoa();
        }
    }

    /**
     * TÌm kiếm sinh viên theo tên lớp
     * 
     * @return student
     * @throws java.io.IOException
     */
    public void searchByClassName() throws java.io.IOException {
        String title = """
                \t|---------------------------------|
                \t|   Search student by class name  |
                \t|---------------------------------|
                """;
        System.out.println(title);
        String className;
        System.out.print("Enter the class Name: ");
        className = sc.nextLine();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents(className, "");
        listStudent = a.searchStudentByClassName();
        student = new student[listStudent.size()];
        if (listStudent.size() != 0) {
            for (int i = 0; i < listStudent.size(); i++) {
                String[] infoStudent = listStudent.get(i).split("_");
                student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3], infoStudent[4],
                        infoStudent[5], infoStudent[6], infoStudent[7]);
            }
            for (int i = 0; i < listStudent.size(); i++) {
                System.out.printf("%-17s\t%-11s\t%-7s\t%-10s\t%-11s\t%-8s\t%-5s\t%-11s \n", student[i].getName(),
                        student[i].getBirthDay(), student[i].getGtinh(), student[i].getAddress(),
                        student[i].getStudentId(), student[i].getClassName(), student[i].getKhoa(),
                        student[i].getPhoneNumber());
            }
        } else {
            System.out.println("No find student!");
        }
    }

    /**
     * Tìm kiếm danh sách sinh viên theo khoa
     * 
     * @return student
     * @throws java.io.IOException
     */
    public void searchByKhoa() throws java.io.IOException {
        String title = """
                \t|---------------------------------|
                \t|   Search student by faculty     |
                \t|---------------------------------|
                """;
        System.out.println(title);
        String khoa;
        System.out.print("Enter the faculty: ");
        khoa = sc.nextLine();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents("", khoa);
        listStudent = a.searchStudentByFaculty();
        student = new student[listStudent.size()];
        if (listStudent.size() != 0) {
            for (int i = 0; i < listStudent.size(); i++) {
                String[] infoStudent = listStudent.get(i).split("_");
                student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3], infoStudent[4],
                        infoStudent[5], infoStudent[6], infoStudent[7]);
            }

            for (int i = 0; i < listStudent.size(); i++) {
                System.out.printf("%-17s\t%-11s\t%-7s\t%-10s\t%-11s\t%-8s\t%-5s\t%-11s \n", student[i].getName(),
                        student[i].getBirthDay(), student[i].getGtinh(), student[i].getAddress(),
                        student[i].getStudentId(), student[i].getClassName(), student[i].getKhoa(),
                        student[i].getPhoneNumber());
            }
        } else {
            System.out.println("No find student!");
        }
    }
}
// System.out.fomat("%")
