package week_3.demo_package;
import week_3.demo_package.enums.CourseOffer;
import week_3.demo_package.enums.Gender;
import demo_package.model.*;
import week_3.demo_package.model.*;
import week_3.demo_package.service.implementation.AppicantServiceImplementation;
import week_3.demo_package.service.implementation.PrincipalServiceImplementation;
import week_3.demo_package.service.implementation.StudentServiceImplementation;
import week_3.demo_package.service.implementation.TeacheableServiceImplementation;

public class SchoolSystem {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Vera Enubianozor", 20, Gender.FEMALE);
        Teacher teacher2 = new Teacher("Ikiseh Samuel", 18, Gender.MALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.PYTHON);

        TeacheableServiceImplementation teacheableServiceImplementation1 = new TeacheableServiceImplementation();
        TeacheableServiceImplementation teacheableServiceImplementation2 = new TeacheableServiceImplementation();

        System.out.println("Teacher Data");
        teacheableServiceImplementation1.teachCourse(teacher1, course1);
        System.out.println("************");

        System.out.println("Teacher Data");
        teacheableServiceImplementation2.teachCourse(teacher2, course2);
        System.out.println("************");


        //STUDENT
        Student student1 = new Student("Elo Elemue", 18, Gender.FEMALE);
        Student student2 = new Student("Aruehi-Ohi Prosper", 53, Gender.MALE);

        Course course3 = new Course (CourseOffer.NODE);
        Course course4 = new Course (CourseOffer.PYTHON);

        System.out.println("Student Data");
        teacheableServiceImplementation1.takeCourse(student1, course3);
        System.out.println("************");

        System.out.println("Student Data");
        teacheableServiceImplementation2.takeCourse(student2, course4);
        System.out.println("************");

        //PRINCIPAL
        Principal principal1 = new Principal(23, "John Doe", Gender.MALE);
        PrincipalServiceImplementation principalData = new PrincipalServiceImplementation();

        Student student = new Student("Edwin Ikiseh", 23, Gender.MALE);
        StudentServiceImplementation expelStudent = new StudentServiceImplementation();

        Applicants applicants1 = new Applicants("Last Born", 18, Gender.MALE);
        Applicants applicants2 = new Applicants("Chukwudi Angel", 17, Gender.FEMALE);
        AppicantServiceImplementation applicantData = new AppicantServiceImplementation();

        System.out.println("Principal Data");
        principalData.display(principal1);
        System.out.println("**********");

        System.out.println("Student Expelled Data");
        expelStudent.expelStudent(student, principal1);
        System.out.println("*********");

        System.out.println("Applicant Data");
        applicantData.displayApplicantData(applicants1);
        applicantData.displayApplicantData(applicants2);
        System.out.println("***********");

        System.out.println("Successfull Admission Data");
        applicantData.displayApplicantData(applicants1);
        System.out.println("***********");

        System.out.println("Admission Denied Data");
        applicantData.displayApplicantData(applicants2);

    }
}
