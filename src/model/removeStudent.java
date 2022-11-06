package model;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;

//delete a student from the file students.txt
public class removeStudent {
    public static final void remove(String id) throws java.io.IOException {

        File file = new File("C:\\code java\\qlysinhvien\\src\\model\\data\\students.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        String input = "";
        while ((line = br.readLine()) != null) {
            if (!line.contains(id)) {
                input += line + "\n";
            }
        }
        br.close();
        fr.close();
        file.delete();
        File file2 = new File("C:\\code java\\qlysinhvien\\src\\model\\data\\students.txt");
        file2.createNewFile();
        FileWriter fw = new FileWriter(file2);
        fw.write(input);
        fw.close();
    }
}
