package CourseOverview.Lab31_32_33;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Riverr");

        Department dep1 = new Department("HR", "FF", company);

        Position dep1Pos1 = new Position("Manager", "delegates operations", dep1);
        Position dep1Pos2 = new Position("Secretary", "records operations", dep1);
        Position dep1Pos3 = new Position("Woker", "execute operations", dep1);

        dep1Pos1.addInferior(dep1Pos2);
        dep1Pos1.addInferior(dep1Pos3);
        dep1Pos2.addInferior(dep1Pos3);
        dep1Pos2.setSuperior(dep1Pos1);
        dep1Pos3.setSuperior(dep1Pos2);

        Employee dep1Pos1E = new Employee("340", "Jim", "K", "Rohn", LocalDate.of(1999, 4, 12), "89239823", 8000, dep1Pos1);
        Employee dep1Pos3E = new Employee("914", "Kim", "R", "Sort", LocalDate.of(1999, 5, 19), "43989533", 5000, dep1Pos3);

        Department dep2 = new Department("IT", "SF", company);

        Position dep2Pos1 = new Position("Manager", "delegates operations", dep2);
        Position dep2Pos2 = new Position("Secretary", "records operations", dep2);
        Position dep2Pos3 = new Position("Woker", "execute operations", dep2);

        dep2Pos1.addInferior(dep2Pos2);
        dep2Pos1.addInferior(dep2Pos3);
        dep2Pos2.addInferior(dep2Pos3);
        dep2Pos2.setSuperior(dep2Pos1);
        dep2Pos3.setSuperior(dep2Pos2);

        Employee dep2Pos1E = new Employee("340", "Sal", "K", "Pal", LocalDate.of(1999, 4, 12), "89239823", 8000, dep2Pos1);
        Employee dep2Pos2E = new Employee("843", "Bon", "Z", "Gon", LocalDate.of(1999, 4, 12), "84989539", 7000, dep2Pos2);
        Employee dep2Pos3E = new Employee("914", "Lin", "R", "Hon", LocalDate.of(1999, 5, 19), "43989533", 5000, dep2Pos3);

//        company.print();
//
//        System.out.println("\nTotal Company Salary: " + company.getSalary());

//        Position.printDownLine(dep1Pos1);

        dep2.printReportingHierarchy();
    }
}
