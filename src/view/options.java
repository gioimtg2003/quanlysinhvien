package view;

import java.util.Scanner;

public class options {
    private static Scanner sc = new Scanner(System.in);

    public void getOption() throws java.io.IOException, InterruptedException {
        int option;
        System.out.print("Enter your choice: ");
        option = sc.nextInt();
        clear.clearScreen();
        switch (option) {
            case 1:
                new optionAdd().addStudent();
                break;
            case 2:
            new optionRemove().removeStudent();
                break;
            case 3:
                new optionSearch(1);
                break;
            case 4:
                new optionSearch(2);
                break;
            case 5:
                new optionEditStudent();
                break;
            case 6:
                System.exit(1);
                break;
        }

    }
}