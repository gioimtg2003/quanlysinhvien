package view;
public class clear  {
    public clear() {
    }

    public static final void clearScreen() throws java.io.IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
