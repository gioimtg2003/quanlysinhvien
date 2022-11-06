package view;

import model.searchStudents;
import model.student;
import java.util.ArrayList;

public class optionSearch {
    private student[] student;
    private int option;

    public optionSearch(int option) throws java.io.IOException {
        this.option = option;
        if (this.option == 1) {
            searchById();
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
    public void searchById() throws java.io.IOException {
        String title = """
                \t|---------------------------------|
                \t|   Search student by class name  |
                \t|---------------------------------|
                """;
        System.out.println(title);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String className;
        System.out.print("Enter the class Name: ");
        className = sc.nextLine();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents(className, "");
        listStudent = a.searchStudentByClassName();
        student = new student[listStudent.size()];

        for (int i = 0; i < listStudent.size(); i++) {
            String[] infoStudent = listStudent.get(i).split("_");
            student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3], infoStudent[4],
                    infoStudent[5], infoStudent[6], infoStudent[7]);
        }
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(student[i].getName() + "\t" + student[i].getBirthDay() + "\t" + student[i].getGtinh()
                    + "\t" + student[i].getAddress() + "\t" + student[i].getStudentId() + "\t\t"
                    + student[i].getClassName() + "\t" + student[i].getKhoa() + "\t" + student[i].getPhoneNumber());
        }
        sc.close();
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
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String khoa;
        System.out.print("Enter the faculty: ");
        khoa = sc.nextLine();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents("", khoa);
        listStudent = a.searchStudentByFaculty();
        student = new student[listStudent.size()];
        for (int i = 0; i < listStudent.size(); i++) {
            String[] infoStudent = listStudent.get(i).split("_");
            student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3], infoStudent[4],
                    infoStudent[5], infoStudent[6], infoStudent[7]);
        }
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(student[i].getName() + "\t" + student[i].getBirthDay() + "\t" + student[i].getGtinh()
                    + "\t" + student[i].getAddress() + "\t" + student[i].getStudentId() + "\t"
                    + student[i].getClassName() + "\t" + student[i].getKhoa() + "\t" + student[i].getPhoneNumber());
        }
        sc.close();
    }

}
