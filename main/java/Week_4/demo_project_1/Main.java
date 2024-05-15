package Week_4.demo_project_1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //step 1 create an array of student object
        Student[] students = {
            new Student(1, "Peace", "Mek", "10/10", "Male", 12),
            new Student(2, "Pat", "Erums", "11/12", "Female", 13),
            new Student(3, "Mehek", "Elo", "12/1", "Female", 14),
            new Student(4, "Bosco", "Grace", "1/2", "Female", 15),
            new Student(5, "Prank", "Vera", "4/6", "Female", 16)

        };

        //STEP 2 WRITE STUDENT OBJECT INTO A CSV FILE
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");

            fw.write("Admission ID, FirstName, LastName, DOB, Gender, Age\n");

            //THIS IS AN ENHANCED FOR LOOP IT'S USED IN ARRAYS
            for(Student stud : students){
                fw.write(stud.getAdmissionID() + ",");
                fw.write(stud.getFirstName() + ",");
                fw.write(stud.getLastName() + ",");
                fw.write(stud.getDob() + ",");
                fw.write(stud.getGender() + ",");
                fw.write(stud.getAge()+ "\n");
            }
            fw.close();
            System.out.println("Successfully written into a CSV file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
