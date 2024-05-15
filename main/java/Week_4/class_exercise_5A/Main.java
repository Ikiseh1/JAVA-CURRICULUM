package Week_4.class_exercise_5A;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) {
        Student[] student = new Student[5];

        student[0] = new Student(123, "Samuel", "Ikiseh", 12 / 13, "Male", 12);
        student[1] = new Student(124, "David", "Aitomun", 14 / 19, "Male", 20);
        student[2] = new Student(125, "Vera", "Enubianozor", 12 / 22, "Female", 20);
        student[3] = new Student(126, "Gbe-Emi", "Obiri", 14 / 24, "Female", 20);
        student[4] = new Student(127, "Prosper", "Aruehi", 19 / 21, "Male", 20);

        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try{

            Writer fw = new FileWriter(desktopPath + "/student3.csv");

            for (Student stud : student) {
                fw.write(stud + "\n");


                System.out.println(stud);
            }

            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
