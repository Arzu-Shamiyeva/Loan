public class CorpLoan extends Loan{

    public CorpLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return 0.012;
    }
}
