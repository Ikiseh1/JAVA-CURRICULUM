package Week_4.demo_project_1;

public class Student {
    private int admissionID;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
    private int age;

    public Student(int admissionID, String firstName, String lastName, String dob, String gender, int age) {
        this.admissionID = admissionID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.age = age;
    }

    public int getAdmissionID() {
        return admissionID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
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
                "admissionID='" + admissionID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
