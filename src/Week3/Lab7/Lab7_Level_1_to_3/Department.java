package Week3.Lab7.Lab7_Level_1_to_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private String location;
    private Company company;

    private List<Position> positions;
    public Department(String name, String location, Company company) {
        this.name = name;
        this.location = location;
        positions = new ArrayList<>();
        this.company = company;
        company.addDep(this);
    }

    public String print() {
       StringBuilder sb = new StringBuilder("Department: "+ getName()+ ", Location: " + getLocation());
       sb.append("\n");
        for(Position p : positions){
            sb.append(p.print());
        }
        return sb.toString();
    }

    public double getSalary() {
        double sum = 0;
        for (Position p: positions){
            sum += p.getSalary();
        }
        return sum;
    }

    public void printReportingHierarchy(){
        Position top = null;
        for (Position p: positions){
           if(p.getSuperior() == null) {
               top = p;
               break;
           }
        }
        if(top == null) {
            System.out.println("No Head Position found");
            return;
        }
        Position.printDownLine(top);
    }

    public void addPosition(Position p) {
        this.positions.add(p);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(location, that.location) && Objects.equals(company, that.company) && Objects.equals(positions, that.positions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, company, positions);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", company=" + company +
                ", positions=" + positions +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
