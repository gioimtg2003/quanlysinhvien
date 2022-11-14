package view;

import model.removeStudent;
import model.student;
import model.searchStudents;
import java.util.Scanner;
import java.util.ArrayList;

public class optionRemove {
    private Scanner sc = new Scanner(System.in);
    public optionRemove(){

    }
    /**
     * phương thức này sẽ xóa một sinh viên trong danh sách
     * @throws java.io.IOException
     */
    public  void removeStudent() throws java.io.IOException, InterruptedException {
        String title = """
                \t|---------------------------------|
                \t|   Delete student from the data  |
                \t|---------------------------------|
                """;
        String studentId;
        
        System.out.println(title);
        System.out.print("Enter the student number: ");
        studentId = sc.next();
        sc.nextLine();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents(studentId, "");
        listStudent = a.searchStudentByClassName();
        student[] student = new student[listStudent.size()];
        for (int i = 0; i < listStudent.size(); i++) {
            String[] infoStudent = listStudent.get(i).split("_");
            student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3], infoStudent[4],
                    infoStudent[5], infoStudent[6], infoStudent[7]);
        }
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println("Do you want to delete this student? (Y/N): " + student[i].getName());
            System.out.print("Enter your choice: ");
            String ans = sc.nextLine();
            if (ans.equals("Y") || ans.equals("y")) {
                removeStudent.remove(studentId);
                new display().loading1();
                System.out.println("\rDelete successfully!   ");
            } else if (ans.equals("N") || ans.equals("n")) {
                System.out.println("Delete failed!");
            }
        }

    }


}