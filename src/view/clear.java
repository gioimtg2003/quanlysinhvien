package view;
public class clear  {
    public clear() {
    }
    // phương thức này sẽ xóa màn hình terminal
    public static final void clearScreen() throws java.io.IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
