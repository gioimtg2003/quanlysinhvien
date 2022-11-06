package view;

public class main {
    public main() throws java.io.IOException, InterruptedException {
        
        new loading().InramanHinh();
        menu a = new menu();
        options b = new options();
        while (true) {
            clear.clearScreen();
            a.InramanHinh();
            b.getOption();
        }

    }

}
