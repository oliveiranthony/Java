import entities.Student;
import entities.Enrollment;
import entities.Course;
import entities.Instructor;
import entities.enums.CourseLevel;
//------------------------
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Random idGenerator = new Random();

        System.out.println("---REGISTERING STUDENT---");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Your birth date (dd/MM/yyyy): ");
        Date birthDate = sdf.parse(sc.nextLine());
        Student student = new Student(name, email, birthDate);
        System.out.println();

        //Enrollments of Student
        System.out.print("Quantity of courses the student will enroll in: ");
        int numberOfCourses = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < numberOfCourses; i++) {
            System.out.print("Enter course name: ");
            String nameCourse = sc.nextLine();
            System.out.print("Enter course level: ");
            CourseLevel courseLevel = CourseLevel.valueOf(sc.nextLine());
            System.out.print("Course Instructor: ");
            String nameInstructor = sc.nextLine();
            System.out.print("Email of instructor: ");
            String emailInstructor = sc.nextLine();
            System.out.println();
            LocalDateTime enrollmentMomment = LocalDateTime.now();
            int id = idGenerator.nextInt(1000) + 10000;
            Instructor instructor = new Instructor(nameInstructor, emailInstructor);
            Course courseDetails = new Course(nameCourse, courseLevel, instructor);
            Enrollment enrollment = new Enrollment(enrollmentMomment,id, student, courseDetails);
            student.addEnrollment(enrollment);
        }

        //Finally
        System.out.println(student);

        sc.close();
    }
}