package Week_4.class_activity_1A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {
        //to tell the program where i want the output to be saved to
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            // create and save the csv file in the desktop
            Writer ar = new FileWriter(desktopPath + "/output.csv");

            //content of the csv file
            String fileContent = "I am learning to write to a csv file";

            //adding the filecontent to the csv file created
            ar.write(fileContent);

            //closing the program
            ar.close();

            //print this in the terminal
            System.out.println("Successfully write into the csv file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
