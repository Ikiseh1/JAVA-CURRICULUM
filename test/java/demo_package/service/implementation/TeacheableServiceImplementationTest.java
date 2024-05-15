package demo_package.service.implementation;

import week_3.demo_package.enums.CourseOffer;
import week_3.demo_package.enums.Gender;
import week_3.demo_package.model.Course;
import week_3.demo_package.model.Teacher;
import org.junit.jupiter.api.Test;
import week_3.demo_package.service.implementation.TeacheableServiceImplementation;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeacheableServiceImplementationTest {

    @Test
    void itShouldBeAbleToteachCourse() {
        //Arrange
        //Create a mock Teacher object
        Teacher teacherInput = new Teacher("John Doe",35, Gender.MALE);

        //Create a mock course object
        Course course = new Course(CourseOffer.JAVA);

        //Create an instance of TeachableServiceImplementation
        TeacheableServiceImplementation teachableService = new TeacheableServiceImplementation();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(actualContent));
        //Act
        //call the method being tested
        teachableService.teachCourse(teacherInput, course);

        //Assert
        //Retrieve the output from the console
        //String expected = "FullName : John Doe\nGender : MALE\nAge : 35\nCourse taught : PYTHON\n";
        String expected = "FullName : John Doe\nGender : MALE\nAge : 35\nCourse taught : JAVA\n";
        assertEquals(expected, actualContent.toString());

    }

    @Test
    void itShouldBeAbleToTakeCourse() {

    }
}