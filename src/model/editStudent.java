package model;
import java.io.*;

public class editStudent {
    private String id, data;
    private int option;
    private student editStudent;
    public editStudent(String id, int option, String data) {
        this.id = id;
        this.option = option;
        this.data = data;
    }
    public void set_student() throws IOException {
        String[] temp;
        String input = "";
        BufferedReader fb = new BufferedReader(new FileReader(student.file));
        String line;
        line = fb.readLine();
        while (line != null) {

            if (line.contains(id)) {
                temp = line.split("_");
                editStudent = new student(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7]);
                edit();
                line = editStudent.getName() + "_" + editStudent.getBirthDay() + "_" + editStudent.getGtinh() + "_"
                        + editStudent.getAddress() + "_" + editStudent.getStudentId() + "_" + editStudent.getClassName()
                        + "_" + editStudent.getKhoa() + "_" + editStudent.getPhoneNumber();
            }
            input += line + "\n";
            line = fb.readLine();
        }
        fb.close();
        student.file.delete();
        student.file.createNewFile();
        BufferedWriter fw = new BufferedWriter(new FileWriter(student.file));
        fw.write(input);
        fw.close();

    }

    public void edit() throws IOException {

        if (option == 1) {
            editStudent.setName(data);
        } else if (option == 2) {
            editStudent.setBirthDay(data);
        } else if (option == 3) {
            editStudent.setGtinh(data);

        } else if (option == 4) {
            editStudent.setAddress(data);

        } else if (option == 5) {
            editStudent.setClassName(data);

        } else if (option == 6) {
            editStudent.setKhoa(data);

        } else if (option == 7) {
            editStudent.setPhoneNumber(data);

        }

    }
}
