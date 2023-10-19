public abstract class Loan{
    private int loanId;
    private double loanAmount;
    private double commLoan;

    public Loan(int loanId, double loanAmount) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
    }



    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public abstract double getCommLoan();


}
