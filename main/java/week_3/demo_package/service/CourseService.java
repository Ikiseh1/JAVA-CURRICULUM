package week_3.demo_package.service;

import week_3.demo_package.model.Course;
import week_3.demo_package.model.Student;
import week_3.demo_package.model.Teacher;

public interface CourseService {

    //THIS IS AN ABSTRACT METHOD WITHOUT A BODY THAT GOES INTO YOUR INTERFACE
    void teachCourse(Teacher teacher, Course course);

    void takeCourse(Student student, Course course);

}
