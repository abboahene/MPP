package week4.ExtraCredit.Extra1;

// Program 4: Employee.java
// Employee class.

public class Employee
{
    private String name;
    private double salary;

    // constructor
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-8s %-8s",
                getName(), getSalary());
    } // end method toString
}

