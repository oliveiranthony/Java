package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Enrollment {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    private LocalDateTime moment;
    private Integer enrollmentID;

    private Student student;
    private Course course;

    public Enrollment() {
    }
    public Enrollment(LocalDateTime moment, Integer enrollmentID, Student student, Course course) {
        this.moment = moment;
        this.enrollmentID = enrollmentID;
        this.student = student;
        this.course = course;
    }
    public LocalDateTime getMoment() {
        return moment;
    }
    public Integer getEnrollmentID() {
        return enrollmentID;
    }
    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }

    public String toString() {
        return course +
                "Enrollment realize in " + dtf.format(moment)
                + " - Enrollment ID: " + enrollmentID;
    }
}
