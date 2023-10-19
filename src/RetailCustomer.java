public class RetailCustomer extends Customer{

    public RetailCustomer(int customerId, String customerName, Loan customerLoan) {
        super(customerId, customerName, customerLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return this.getCustomerLoan().getCommLoan()-0.02;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
