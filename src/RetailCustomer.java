public class RetailCustomer extends Customer{

    public RetailCustomer(int customerId, String customerName, RetailLoan customerLoan) {
        super(customerId, customerName, customerLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return 2;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
