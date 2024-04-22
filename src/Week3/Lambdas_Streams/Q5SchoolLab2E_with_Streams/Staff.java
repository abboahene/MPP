package Week3.Lambdas_Streams.Q5SchoolLab2E_with_Streams;

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
