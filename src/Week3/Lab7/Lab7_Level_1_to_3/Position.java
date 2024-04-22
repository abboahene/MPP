package Week3.Lab7.Lab7_Level_1_to_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {

    private String title;
    private String description;
    private Employee employee;

    private Department department;
    private Position superior;
    private List<Position> inferiors;

    public Position(String title, String description, Department department) {
        this.title = title;
        this.description = description;
        inferiors = new ArrayList<>();
        this.department = department;
        department.addPosition(this);
    }
    public Position(String title, String description, Department department, Employee employee) {
        this(title, description, department);
        this.employee = employee;
    }

    public String print(){
        StringBuilder sb = new StringBuilder("Position: "+ title + ", Desc: "+ description);
        sb.append(", ");
        if(employee != null) sb.append(employee.print());
        else sb.append("No Employee\n");
        return sb.toString();
    }

    public double getSalary() {
        if(employee == null) return 0;
        return  employee.getSalary();
    }

    private static int trackSpace = 0;
    public static void printDownLine(Position p){
        if(p == null) return;
        int space = trackSpace * 2;
        String gap = (space == 0 ? "": Integer.toString(trackSpace * 2));
        String gapChar = (space == 0 ? "": " ");
        System.out.printf("%"+ gap + "s %s",gapChar, p.print());

        for(Position inferior: p.inferiors) {
            trackSpace++;
            printDownLine(inferior);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Position getSuperior() {
        return superior;
    }

    public void setSuperior(Position superior) {
        this.superior = superior;
    }

    public List<Position> getInferiors() {
        return List.copyOf(inferiors);
    }

    public void addInferior(Position inferior) {
        this.inferiors.add(inferior);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setInferiors(List<Position> inferiors) {
        this.inferiors = inferiors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return Objects.equals(title, position.title) && Objects.equals(description, position.description) && Objects.equals(employee, position.employee) && Objects.equals(department, position.department) && Objects.equals(superior, position.superior) && Objects.equals(inferiors, position.inferiors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, employee, department, superior, inferiors);
    }

    @Override
    public String toString() {
        return "Position{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                ", department=" + department +
                ", superior=" + superior +
                ", inferiors=" + inferiors +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Position copy = (Position) super.clone();
        copy.department = (Department) this.department.clone();
        copy.inferiors = List.copyOf(inferiors);
        return copy;
    }
}
