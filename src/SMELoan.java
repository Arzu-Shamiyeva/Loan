public class SMELoan  extends Loan{

    public SMELoan() {
    }

    public SMELoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return 3;
    }

}
