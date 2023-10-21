import java.util.Objects;

public abstract class Customer implements DiscountService{
    private int customerId;
    private String customerName;
    private Loan customerLoan;

    public Customer() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;
        return customerId == customer.customerId && Objects.equals(customerName, customer.customerName) && Objects.equals(customerLoan, customer.customerLoan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerLoan);
    }
}
