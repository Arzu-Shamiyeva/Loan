public class CorpCustomer extends Customer {

    public CorpCustomer(int customerId, String customerName, CorpLoan customerLoan) {
        super(customerId, customerName, customerLoan);
    }

    @Override
    public double discountForLoanCommission() {
        return 0.5;
    }

    @Override
    public double discountForPaymentCommission() {
        return 0;
    }
}
