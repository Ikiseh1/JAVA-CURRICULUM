package Week_4.exercise.day1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main2 {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try{
            Writer it = new FileWriter(desktopPath + "/input2.csv");
            String fileContent = "Erums is a Boy";
            it.write(fileContent);
            System.out.println("Its working");
            it.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
