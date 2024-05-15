package week_3.demo_package.service.implementation;

import week_3.demo_package.model.Principal;
import week_3.demo_package.model.Student;
import week_3.demo_package.service.StudentService;

public class StudentServiceImplementation implements StudentService {

    @Override
    public void expelStudent(Student student, Principal principal) {
        System.out.println("Student FullName: " + student.getName()
        + "\n" + "Expulsion Duration: " + "2 WEEKS " + "\n" + "Expelled BY: " + "Principal " + principal.getName());

    }
}
