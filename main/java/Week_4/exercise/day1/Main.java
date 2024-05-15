package Week_4.exercise.day1;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer hy = new FileWriter(desktopPath + "/input.csv");
            String fileContent = "Ikiseh is a Mechanical Engineer";
            String fileContent1 = "\nIkiseh Loves Family";

            hy.write(fileContent + fileContent1);

//            hy.write(fileContent1);
            System.out.println("Successfully Printed");
            hy.close();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}
