package autoboxing1.sol;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Korea Bank");

        bank.addBranch("Seoul");

        bank.addCustomer("Seoul", "Kim", 50.05);
        bank.addCustomer("Seoul", "Lee", 175.34);
        bank.addCustomer("Seoul", "Soo", 220.12);

        bank.addBranch("Incheon");
        bank.addCustomer("Incheon", "Park", 150.54);

        bank.addCustomerTransaction("Seoul", "Kim", 44.22);
        bank.addCustomerTransaction("Seoul", "Kim", 12.44);
        bank.addCustomerTransaction("Seoul", "Lee", 1.65);

        bank.listCustomers("Seoul", false);
        bank.listCustomers("Seoul", true);

        if (!bank.addCustomer("GyeongGi", "Brian", 5.53)) {
            System.out.println("Error, Gyeongi Branch doesn't exist");
        }
    }
}
