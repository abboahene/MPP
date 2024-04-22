package Week3.Lambdas_Streams.Q6Lab31_32_33_with_streams;

import java.util.ArrayList;
import java.util.List;

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
}
