package autoboxing1;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    String name;

    public Customer(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double tr) {
        transactions.add(tr);
    }

}
