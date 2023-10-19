public class RetailLoan  extends Loan{

    public RetailLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return 0.05;
    }
}
