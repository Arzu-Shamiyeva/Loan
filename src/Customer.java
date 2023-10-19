public abstract class Customer implements DiscountService{
    private int customerId;
    private String customerName;
    private Loan customerLoan;

    public Customer(int customerId, String customerName, Loan customerLoan) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerLoan = customerLoan;
    }



    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Loan getCustomerLoan() {
        return customerLoan;
    }

    public void setCustomerLoan(Loan customerLoan) {
        this.customerLoan = customerLoan;
    }
}
