package CourseOverview.StandardExamsPractice.Exams1;

public class SavingsAccount extends Account{

    private double balance;
    private double interestRate;
    private String acctld;

    SavingsAccount(String acctld, Double interestRate, double startBalance){
        this.acctld = acctld;
        this.interestRate = interestRate;
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
        return balance + (interestRate * balance);
    }
}
