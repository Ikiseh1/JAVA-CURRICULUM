package Week_4.class_activity_2A;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {
        //ACCESS FROM DESKTOP
        String desktopPath = System.getProperty("user.home") + "/Desktop";


        try {

            //READ THE CSV FILE FROM THE DESKTOP
            Reader r = new FileReader(desktopPath+ "/output.csv");

            //READ METHODS READS AS NUMBERS
            int readContent = r.read();

            //STOP AT -1 ONCE IT HAS READ ALL THE CHARACTERS
            while(readContent != -1) {

                //CONVERT IT BACK TO CHARACTERS
                System.out.print((char) readContent);

                //PRINT THE READ FILES
                readContent = r.read();
            }
            r.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
