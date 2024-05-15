package week_3.demo_package.model;

import week_3.demo_package.enums.CourseOffer;

public class Course {
    private CourseOffer courseOffer;

    public void setCourseOffer(CourseOffer courseOffer){
        this.courseOffer = courseOffer;
    }

    public CourseOffer getcourseOffer(){
        return courseOffer;
    }
//CONSTRUCTOR
    public Course(CourseOffer courseOffer){
        this.courseOffer = courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }
}
