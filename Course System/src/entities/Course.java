package entities;
import entities.enums.CourseLevel;
//--------------------------------
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private CourseLevel level;

    private Instructor instructor;

    List<Enrollment> enrollments = new ArrayList<>();

    public Course() {
    }
    public Course(String name, CourseLevel level, Instructor instructor) {
        this.name = name;
        this.level = level;
        this.instructor = instructor;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }
    public CourseLevel getLevel() {
        return level;
    } public void setLevel(CourseLevel level) {
        this.level = level;
    }
    public Instructor getInstructor() {
        return instructor;
    } public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void addCourseInEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }
    public void removeCourseInEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    public String toString() {
        return name + " - " + level + " - " + "Instructor: " + instructor + "\n";
    }
}
