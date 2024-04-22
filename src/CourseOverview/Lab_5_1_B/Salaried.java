package CourseOverview.Lab_5_1_B;

public class Salaried extends Employee{

    private double salary;

    public Salaried(String empId, double salary) {
        super(empId);
        this.salary = salary;
    }


    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                '}';
    }
}
