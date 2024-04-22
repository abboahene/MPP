package CourseOverview.Lab31_32_33;

import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private LocalDate birthDate;
    private String ssn;
    private double salary;
    private Position position;

    public Employee(String employeeId, String firstName,
                    String middleInitial, String lastName, LocalDate birthDate,
                    String ssn, double salary, Position position) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ssn = ssn;
        this.salary = salary;
        this.position = position;
        position.setEmployee(this);
    }

    public String print() {
        return "Employee: "+ firstName +" "+lastName +", Id: " + employeeId + "\n";
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
