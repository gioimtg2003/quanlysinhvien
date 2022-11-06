package view;

import model.addStudent;
import model.student;

import java.util.Scanner;

public class optionAdd {
    private static student[] infoStudent;

    /**
     * Thêm một hoặc nhiều sinh viên vào file students.txt
     * 
     * @return student
     * @throws java.io.IOException
     */
    public static void addStudent() throws java.io.IOException, InterruptedException {
        String title = """
                \t|---------------------------------|
                \t|       Add to the student        |
                \t|---------------------------------|
                """;
        String name, birthDay, gtinh, address, studentId, className, Khoa, phoneNumber;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println(title);
        System.out.print("Enter the number of students: ");
        n = sc.nextInt();
        sc.nextLine();
        Exceptions.inputStudentNumber(n);
        clear.clearScreen();
        infoStudent = new student[n];
        for (int i = 0; i < n; i++) {
            System.out.println(title);
            System.out.println("Enter the information of student " + (i + 1) + ": ");
            System.out.print("Enter the Name: ");
            name = sc.nextLine();
            Exceptions.inputProperties(name, "name");
            System.out.print("Enter the BirthDay: ");
            birthDay = sc.nextLine();
            Exceptions.inputProperties(birthDay, "birthday");
            System.out.print("Enter the gender: ");
            gtinh = sc.nextLine();
            Exceptions.inputProperties(gtinh, "gender");
            System.out.print("Enter the address: ");
            address = sc.nextLine();
            Exceptions.inputProperties(address, "address");
            System.out.print("Enter the student number: ");
            studentId = sc.nextLine();
            Exceptions.inputProperties(studentId, "studentId");
            System.out.print("Enter the class name: ");
            className = sc.nextLine();
            Exceptions.inputProperties(className, "className");
            System.out.print("Enter the faculty name: ");
            Khoa = sc.nextLine();
            Exceptions.inputProperties(Khoa, "Khoa");
            System.out.print("Enter the phone Number: ");
            phoneNumber = sc.nextLine();
            Exceptions.inputProperties(phoneNumber, "phoneNumber");
            infoStudent[i] = new student(name, birthDay, gtinh, address, studentId, className, Khoa, phoneNumber);
            addStudent.add(infoStudent[i].getName(), infoStudent[i].getBirthDay(), infoStudent[i].getGtinh(),
                    infoStudent[i].getAddress(), infoStudent[i].getStudentId(), infoStudent[i].getClassName(),
                    infoStudent[i].getKhoa(), infoStudent[i].getPhoneNumber());
            clear.clearScreen();
        }
        sc.close();
    }
}
