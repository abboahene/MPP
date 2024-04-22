package CourseOverview.SchoolLab2E;

import java.util.*;

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
        int sum = 0;
        for(Course c: courses){
            sum += sum;
        }
        return sum;
    }
}
