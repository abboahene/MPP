package Week3.Lambdas_Streams.Q5SchoolLab2E_with_Streams;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

    private double salary;
    private List<Course> courses = new ArrayList<>();

    public Faculty(String name, String phone, int age, double salary) {
        super(name, phone, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
