package Week_4;

import java.io.FileWriter;
import java.io.IOException;

public class class_activity_4A {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try{
            FileWriter fr = new FileWriter(desktopPath + "/output3.csv");
            fr.write("I am learning how to write into a csv file");

            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("It's Working");
    }
}
