package Week3.Lambdas_Streams.Q5SchoolLab2E_with_Streams;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private double gpa;
    private List<Course> courses = new ArrayList<>();

    Student(String name, String phone, int age, double gpa){
        super(name, phone, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public List<String> getCourseNumbers() {
        return courses.stream().map(Course::getNumber).toList();
    }

    public void addCourse(Course c) {
        this.courses.add(c);
    }

    public int getTotalUnits(){
        return courses.stream()
                .mapToInt(Course::getUnits)
                .sum();
    }
}
