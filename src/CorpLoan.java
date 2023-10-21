public class CorpLoan extends Loan{

    public CorpLoan() {
    }

    public CorpLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return 1.2;
    }
}
