public class RetailLoan  extends Loan{

    public RetailLoan() {
    }

    public RetailLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return 5;
    }
}
