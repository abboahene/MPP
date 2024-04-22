package CourseOverview.StandardExamsPractice.Exams1;

public class CheckingAccount extends Account {

    private double balance;
    private double monthlyFee;
    private String acctld;

    CheckingAccount(String acctld, Double fee, double startBalance){
        this.acctld = acctld;
        monthlyFee = fee;
        balance = startBalance;
    }

    @Override
    String getAccountID() {
        return acctld;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
