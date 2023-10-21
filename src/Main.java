// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Customer customer = new CorpCustomer(1, "Arzu", new CorpLoan(11, 1000));


        System.out.println(customer.getCustomerLoan().getLoanAmount()*(customer.getCustomerLoan().getCommLoan()-customer.discountForLoanCommission())/100);


        Customer customer1 = new RetailCustomer(1, "Arzu", new RetailLoan(22, 2000));


        System.out.println(customer1.getCustomerLoan().getLoanAmount()*(customer1.getCustomerLoan().getCommLoan()-customer1.discountForLoanCommission())/100);

    }
}