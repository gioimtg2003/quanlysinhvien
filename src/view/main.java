package view;

public class main {
    private static java.util.Scanner sc = new java.util.Scanner(System.in);
    public main() throws java.io.IOException, InterruptedException {
        clear.clearScreen();
        display view = new display();
        view.loading2();
        options b = new options();
        while (true) {
            clear.clearScreen();
            view.InramanHinh();
            b.getOption();
            sc.nextLine();
        }

    }

}
