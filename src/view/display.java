package view;

public class display implements print, animation {

    @Override
    public void loading1() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            System.out.print("\rPlease wait [-] ");
            Thread.sleep(200);
            System.out.print("\rPlease wait [\\] ");
            Thread.sleep(200);
            System.out.print("\rPlease wait [|] ");
            Thread.sleep(200);
            System.out.print("\rPlease wait [/] ");
            Thread.sleep(200);
            System.out.print("\r");
        }

    }

    @Override
    public void loading2() throws InterruptedException {
        // TODO Auto-generated method stub
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

    @Override
    public void InramanHinh() {
        String menu = """
                |--------------------------------|
                | 1. Add student                 |
                | 2. Delete student              |
                | 3. Search student by class name|
                | 4. Search student by faculty   |
                | 5. Edit student                |
                | 6. Exit                        |
                |--------------------------------|
                """;
        System.out.println(menu);

    }

}
