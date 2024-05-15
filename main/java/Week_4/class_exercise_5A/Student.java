package Week_4.class_exercise_5A;

public class Student {
    private int AdmissionNumber;
    private String FirstName;
    private String LastName;
    private int DateOfBirth;
    private String gender;
    private int age;

    public Student(int AdmissionNumber,String FirstName, String LastName, int DateOfBirth, String Gender, int Age ){
        this.AdmissionNumber= AdmissionNumber;
        this.FirstName= FirstName;
        this.LastName= LastName;
        this.DateOfBirth= DateOfBirth;
        this.gender= Gender;
        this.age= age;
        }

    public int getAdmissionNumber() {
        return AdmissionNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getDateOfBirth() {
        return DateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "AdmissionNumber=" + AdmissionNumber +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
