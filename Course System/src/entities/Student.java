package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Student {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String name;
    private String email;
    private Date birthDate;

    private Enrollment enrollment;

    List<Enrollment> enrollments = new ArrayList<>();

    public Student() {
    }
    public Student(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    } public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    } public void setEmail(String email) {
        this.email = email;
    }
    public Date getBirthDate() {
        return birthDate;
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }
    public void removeEnrollment(Enrollment enrollment) {
        enrollments.remove(enrollment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("STUDENT DATA:\n");
        sb.append("Name: " + name + "\n"
                + "Email Registered: " + email + "\n"
                + "Birth Date: " + sdf.format(birthDate) + "\n");
        sb.append("ENROLLMENTS:\n");
        for(Enrollment enrollment : enrollments) {
            sb.append(enrollment + "\n");
            sb.append("\n");
        }
        return sb.toString();
    }
}
