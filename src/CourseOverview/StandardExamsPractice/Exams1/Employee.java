package CourseOverview.StandardExamsPractice.Exams1;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;

    private List<Account> accounts;

    Employee(String name){
        this.name = name;
        accounts = new ArrayList<>();
    }

    public double computeUpdatedBalanceSum() {

        double total = 0;
        for(Account acc: accounts){
            total += acc.computeUpdatedBalance();
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account acc){
        accounts.add(acc);
    }
}
