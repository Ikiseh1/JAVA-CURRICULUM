package week_3.demo_package.service.implementation;

import week_3.demo_package.model.Course;
import week_3.demo_package.model.Student;
import week_3.demo_package.model.Teacher;
import week_3.demo_package.service.CourseService;

public class TeacheableServiceImplementation implements CourseService {
    public void teachCourse(Teacher teacher, Course course){
//        System.out.println("FullName: " + teacher.getName()
//                + "\n"
//                + "Gender: " + teacher.getgender()
//                + "\n"
//                + "Age: " + teacher.getAge()
//                + "Course taught: " + course.getcourseOffer());
        System.out.println("FullName : " + teacher.getName() + "\n" + "Gender : " + teacher.getgender() + "\n"
                + "Age : " + teacher.getAge() + "\n" + "Course taught : " + course.getcourseOffer());
}


    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("FullName: " + student.getName()
        + "\n"
        + "Gender: "+ student.getName()
        + "\n"
        + "Age: " + student.getAge()
        + "\n"
        + "Course Taken: " + course.getcourseOffer());

    }
}
