package Week3.ExtraCredit.Extra1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        //create employee objs
        Function<Integer, List<Employee>> createEmps = (n) -> {
            List<Employee> emps = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                emps.add(new Employee("Tom Jones" + i, 87439));
            }
            return emps;
        };

        Consumer<List<Employee>> calculateTotalSalary = (l) ->{
           double total = l.stream()
                    .mapToDouble(Employee::getSalary)
                    .sum();
            System.out.printf("Total salary: %,.2f%n", total);
        };
        Consumer<List<Employee>> calculateTotalSalaryParallel = (l) ->{
           double total = l.parallelStream()
                    .mapToDouble(Employee::getSalary)
                    .sum();
            System.out.printf("Total salary: %,.2f%n", total);
        };

        BiConsumer<Consumer<List<Employee>>, List<Employee>> getTimePerfromance = (c, list) -> {
            int startTime = LocalTime.now().getNano() / 1_000_000;

            c.accept(list);

            int endTime = LocalTime.now().getNano() / 1_000_000;
            int timeTaken = endTime - startTime;

            System.out.printf("function took %sms to complete%n", timeTaken);
        };

        List<Employee> emps300 = createEmps.apply(300);
        List<Employee> emps40k = createEmps.apply(40000);
        List<Employee> emps800k = createEmps.apply(10000000);

        System.out.println("300 emps");
        System.out.println("normal");
        getTimePerfromance.accept(calculateTotalSalary, emps300);
        System.out.println("parallel");
        getTimePerfromance.accept(calculateTotalSalaryParallel, emps300);

        System.out.println("40k emps");
        System.out.println("normal");
        getTimePerfromance.accept(calculateTotalSalary, emps40k);
        System.out.println("parallel");
        getTimePerfromance.accept(calculateTotalSalaryParallel, emps40k);

        System.out.println("800k emps");
        System.out.println("normal");
        getTimePerfromance.accept(calculateTotalSalary, emps800k);
        System.out.println("parallel");
        getTimePerfromance.accept(calculateTotalSalaryParallel, emps800k);

    }
}
