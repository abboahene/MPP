package Week3.Lab7.Lab7_Level_4_Q9;

public class Staff extends Person {

    private double salary;

    Staff(String name, String phone, int age, double salary){
        super(name, phone, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
