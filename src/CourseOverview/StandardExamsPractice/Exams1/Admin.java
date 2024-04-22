package CourseOverview.StandardExamsPractice.Exams1;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        double total = 0;
        for(Employee e: list){
            total += e.computeUpdatedBalanceSum();
        }
        return total;
    }
}
