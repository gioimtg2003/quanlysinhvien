package view;


import java.util.Scanner;

public class options {


    public void getOption() throws java.io.IOException, InterruptedException {
        int option;
        System.out.flush();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        option = sc.nextInt();
        Exceptions.inputChoice(option);
        sc.nextLine();
        clear.clearScreen();
        switch (option) {
            case 1:
                optionAdd.addStudent();
                break;
            case 2:
                optionRemove.removeStudent();
                break;
            case 3:
                new optionSearch(1);
                break;
            case 4:
                new optionSearch(2);
                break;
            case 5:
                System.exit(1);
        }
        sc.close();
    }
}
