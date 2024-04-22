package CourseOverview.Lab31_32_33;

import java.util.ArrayList;
import java.util.List;

public class Company {
        private String name;
        private List<Department> departments;

        Company(String name){
            this.name = name;
            departments = new ArrayList<>();
        }

    public void print() {
        StringBuilder sb = new StringBuilder("Company: "+ name);
        sb.append("\n");
        for(Department d : departments){
            sb.append(d.print());
        }
        System.out.println(sb);
    }

    public double getSalary() {
        double sum = 0;
        for(Department d : departments){
           sum += d.getSalary();
        }
        return sum;
    }

    public void addDep(Department dep) {
        this.departments.add(dep);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
