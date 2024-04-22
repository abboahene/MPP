package Week3.Lab7.Lab7_Level_4_Q9;

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
        int sum = 0;
        for(Course c: courses){
            sum += sum;
        }
        return sum;
    }

}
