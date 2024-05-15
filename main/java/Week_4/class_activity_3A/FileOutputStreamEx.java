package Week_4.class_activity_3A;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try {
            FileOutputStream out = new FileOutputStream(desktopPath + "/output1.csv");
            String ar = "I am still learning how to write File";
            byte[] bytes = ar.getBytes();
            out.write(bytes);
            out.close();
            System.out.println("Successfully written to a file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
