public class SMECustomer extends Customer{

    public SMECustomer() {
    }

    public SMECustomer(int customerId, String customerName, SMELoan customerLoan) {
        super(customerId, customerName, customerLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return 1;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
