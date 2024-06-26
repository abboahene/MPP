package Week3.Lambdas_Streams.Q2;

// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
    public static void main(String[] args)
    {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);   //A method reference.

        // Predicate (boolean-valued function) that returns true for salaries
        //in the range $4000-$6000
        Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        System.out.printf(
                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        // sort employees in descending order by last name, then first name
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // display only first and last names
        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        // group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

        // count number of Employees in each department
        System.out.printf("%nCount of Employees by department:%n");

        Map<String, Long> employeeCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new, Collectors.counting()));

        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s)%n", department, count));

/*  Output looks something like :

        HR  4
        IT  8
        Sales  12
*/


        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2));

        // average of Employee salaries with DoubleStream average method
        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());

        // count the number of last names that begin with the letter  ‘B’
        System.out.printf("Number of last names that begin with the letter  ‘B’: %2d%n",
                list.stream().filter(e -> ((Employee) e).getLastName().startsWith("B") ).count());
        // count the number of last names that begin with the letter  ‘B’ sorted
        System.out.printf("Employees with lastNames that begin with the letter  ‘B’ (sorted): %s%n",
                list.stream()
                        .filter(e -> ((Employee) e).getLastName().startsWith("B"))
                        .sorted(lastThenFirst).collect(Collectors.toList()));

        // count the number of last names that begin with the letter  ‘B’ (firstName & LastName Uppercase) V1
        System.out.printf("Employees with lastNames that begin with the letter ‘B’ (firstName & LastName Uppercase) V1: %s%n",
                list.stream()
                        .filter(e -> ((Employee) e).getLastName().startsWith("B"))
                        .map(e -> {
                            Employee emp = new Employee(e.getFirstName(), e.getLastName(), e.getSalary(), e.getDepartment());
                            emp.setFirstName(e.getFirstName().toUpperCase());
                            emp.setLastName(e.getLastName().toUpperCase());
                            return emp;
                        })
                        .collect(Collectors.toList()));

        // count the number of last names that begin with the letter  ‘B’ (firstName & LastName Uppercase) V2
//        System.out.printf("Employees with lastNames that begin with the letter  ‘B’ (firstName & LastName Uppercase) V2: %s%n",
//                list.stream()
//                        .filter(e -> ((Employee) e).getLastName().startsWith("B"))
//                        .map(e -> {
//                            e.setFirstName(e.getFirstName().toUpperCase());
//                            e.setLastName(e.getLastName().toUpperCase());
//                            return e;
//                        })
//                        .collect(Collectors.toList()));

        // Print out All of the employee objects, but if the last name begins with the letter  ‘B’ (LastName Uppercase)
        System.out.printf("Print out All of the employee objects, but if the last name begins with the letter  ‘B’ (LastName Uppercase) V1: %s%n",
                list.stream()
                        .map(e -> {
                            if(e.getLastName().startsWith("B")) {
                                e.setLastName(e.getLastName().toUpperCase());
                            }
                            return e;
                        })
                        .collect(Collectors.toList()));

// Use the  Collectors.joining  method to print out All Employee objects.
        System.out.printf("Use the  Collectors.joining  method to print out All Employee objects.: %s%n",
                list.stream()
                        .map(Employee::toString)
                        .collect(Collectors.joining()));

        // Use the  Collectors.joining  method to print out All Employee objects with delimiter.
        System.out.printf("Use the  Collectors.joining  method to print out All Employee objects with delimiter: %s%n",
                list.stream()
                        .map(Employee::toString)
                        .collect(Collectors.joining("---\n---")));

        // Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’ (sorted, distinct)
        System.out.printf("Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’ (sorted, distinct) : %s%n",
                list.stream()
                        .filter(e -> ((Employee) e).getLastName().startsWith("I"))
                        .map(Employee::getLastName)
                        .sorted()
                        .distinct()
                        .collect(Collectors.toList()));

        // Print out the average of all the salaries
        System.out.printf("Print out the average of all the salaries : %s%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average());

        // Use the ‘reduce’  method to print out the total salary of all employees
        System.out.printf("Use the  ‘reduce’  method to print out the total salary of all employees: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, Double::sum));

        // Print out only the first names of all the employees (use map)
        System.out.printf("Print out only the first names of all the employees (use map): %s%n",
                list.stream()
                        .map(Employee::getFirstName)
                        .collect(Collectors.toList()));

        // Create an infinite stream of even numbers (0, 2, 4, …) (limit 20)
        IntStream infiniteNumbers = IntStream.iterate(0, n -> n + 2);
        System.out.printf("Create an infinite stream of even numbers (0, 2, 4, …) (limit 20): %s%n",
                infiniteNumbers
                        .limit(20)
                        .mapToDouble(e-> e)
                        .boxed()
                        .collect(Collectors.toList()));

        List<String> arr  =new ArrayList<>();
        arr.add("Mdsf");
        arr.add("Lkfjds");
        arr.add("Hkdfs");
        arr.add("Haklfd");
        arr.add("Dfie");
        arr.add("Deei");
        arr.add("Aaaa");

        System.out.println(arr);
        System.out.println(arr.stream().sorted((a,b) -> {
            if(a.startsWith("D")) return -2;
            else if(a.startsWith("H"))return -1;
            else return 1;
        }).toList());


    } // end main

} // end class ProcessingEmployees

