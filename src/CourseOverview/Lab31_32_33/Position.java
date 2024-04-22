package CourseOverview.Lab31_32_33;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String title;
    private String description;
    private Employee employee;

    private  Department department;
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
}
