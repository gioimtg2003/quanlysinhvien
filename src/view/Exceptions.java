package view;

public class Exceptions {
    static void inputStudentNumber(int n){
        if(n<0){
            throw new ArithmeticException("Value must be greater than 0");
        }
    }
    static void inputProperties(String n, String s){
        if(n.equals("")){
            throw new ArithmeticException("You need to enter the " + s);
        }
    }
    static void inputChoice(int n){
        if(n<0 || n>5){
            throw new ArithmeticException("You need to enter the number from 1 to 5");
        }
    }
}
