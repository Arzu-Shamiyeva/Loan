public class CorpLoan extends Loan{

    public  final double commLoan = 1.2;
    public CorpLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getCommLoan() {
        return commLoan;
    }
}
