public class RetailLoan  extends Loan{

    public  final double comm = 5;
    public RetailLoan(int loanId, double loanAmount) {
        super(loanId, loanAmount);
    }

    public double getComm() {
        return comm;
    }
}
