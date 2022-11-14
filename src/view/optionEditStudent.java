package view;

import java.util.Scanner;
import java.util.ArrayList;
import model.editStudent;
import model.searchStudents;
import model.student;

public class optionEditStudent {
    private  java.util.Scanner sc = new Scanner(System.in);
    private String id;
    private String title = """
            \t|--------------------------------|
            \t|      Edit student's name       |
            \t|--------------------------------|
            """;
    public optionEditStudent() throws java.io.IOException {
        getStudent();
        inputOption();
    }

    public void inputOption() throws java.io.IOException {
        int d = 0;
        String option = null;
        String data = null;
        System.out.print("You want to change the name (y/n): ");
        sc.nextLine();
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "name");
            new editStudent(id, 1, data).set_student();
            ;
        }
        System.out.print("You want to change the birth day (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputBirthDay(data);
            new editStudent(id, 2, data).set_student();
            ;
        }
        System.out.print("You want to change the gender (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "gender");
            new editStudent(id, 3, data).set_student();
            ;
        }
        System.out.print("You want to change the address (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "address");
            new editStudent(id, 4, data).set_student();
            ;
        }
        System.out.print("You want to change the class name (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "class name");
            new editStudent(id, 5, data).set_student();
            ;
        }
        System.out.print("You want to change the faculty (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "faculty");
            new editStudent(id, 6, data).set_student();
            ;
        }
        System.out.print("You want to change the phone number (y/n): ");
        option = sc.nextLine();
        if (option.equals("y") || option.equals("Y")) {
            d = 1;
            System.out.print("Please enter new value: ");
            data = sc.nextLine();
            Exceptions.inputProperties(data, "phone number");
            new editStudent(id, 7, data).set_student();
            ;
        }
        if (d == 1) {
            System.out.println("Success!");
            ArrayList<String> listStudent = new ArrayList<String>();
            searchStudents a = new searchStudents(id, "");
            listStudent = a.searchStudentByClassName();
            student[] student = new student[listStudent.size()];

            if (listStudent.size() != 0) {
                for (int i = 0; i < listStudent.size(); i++) {
                    String[] infoStudent = listStudent.get(i).split("_");
                    student[i] = new student(infoStudent[0], infoStudent[1], infoStudent[2], infoStudent[3],
                            infoStudent[4],
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

    public void getStudent() throws java.io.IOException {
        System.out.println(title);
        System.out.print("Enter the student number that needs to be edit: ");
        id = sc.next();
        ArrayList<String> listStudent = new ArrayList<String>();
        searchStudents a = new searchStudents(id, "");
        listStudent = a.searchStudentByClassName();
        student[] student = new student[listStudent.size()];
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
