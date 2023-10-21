import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan loan)) return false;
        return loanId == loan.loanId && Double.compare(loanAmount, loan.loanAmount) == 0 && Double.compare(commLoan, loan.commLoan) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanId, loanAmount, commLoan);
    }
}
