package autoboxing1;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.customers = new ArrayList<>();
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addCustomer(String name, Double trAmount) {
        Customer temp = new Customer(name);
        temp.addTransaction(trAmount);
        this.addCustomer(temp);
    }

    public void transact(String name, Double trAmount) {

        for (Customer cr : customers) {
            if (cr.getName().equals(name)) {
                cr.addTransaction(trAmount);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
