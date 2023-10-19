public class CorpCustomer extends Customer {

    public CorpCustomer(int customerId, String customerName, Loan customerLoan) {
        super(customerId, customerName, customerLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return this.getCustomerLoan().getCommLoan()-0.005;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
