package view;

public class loading implements print {

    public void InramanHinh() throws java.io.IOException, InterruptedException {
        clear.clearScreen();
        for (int i = 0; i < 2; i++) {
            System.out.print("\rLoading: >>>");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rLoading:    >>>");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rLoading:        >>>");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rLoading:            >>>");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("\rLoading:                >>>");
            System.out.print("\r                                    ");
        }

    }

}
