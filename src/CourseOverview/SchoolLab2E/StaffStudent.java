package CourseOverview.SchoolLab2E;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StaffStudent extends Staff {

    private LocalDate startDate;
    private Student student;
    StaffStudent(String name, String phone, int age, double salary, double gpa){
        super(name, phone, age, salary);
        this.student = new Student(name, phone, age, gpa);
    }

    public String getStartDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return startDate.format(formatter);
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
