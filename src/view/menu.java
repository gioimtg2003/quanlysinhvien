package view;

public class menu implements print {
    private String menu = """
            |--------------------------------|
            | 1. Add student                 |
            | 3. Delete student              |
            | 4. Search student by class name|
            | 5. Search student by faculty   |
            | 5. Exit                        |
            |--------------------------------|
            """;

    
    public void InramanHinh() {
        System.out.println(menu);
    }
}
