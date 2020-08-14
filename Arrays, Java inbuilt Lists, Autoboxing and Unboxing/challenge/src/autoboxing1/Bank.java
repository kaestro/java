package autoboxing1;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public void addBranch(String name) {
        branches.add(new Branch(name));
    }

    public void addCustomer(String branchName, String customerName, Double trAmount) {
        for (Branch br : branches) {
            if (br.getName().equals(branchName)) {
                Customer temp = new Customer(customerName);
                temp.addTransaction(trAmount);

                br.addCustomer(temp);
                break;
            }
        }
    }

    public void addTransaction(String branchName, String customerName, Double trAmount) {
        for (Branch br : branches) {
            if (br.getName().equals(branchName)) {
                br.transact(customerName, trAmount);
                break;
            }
        }
    }

    public void queryBranch(String branchName, boolean showTransaction) {
        for (Branch br : branches) {
            if (br.getName().equals(branchName)) {
                for (Customer cs : br.getCustomers()) {
                    System.out.print(cs.getName() + " ");
                    if (showTransaction) {
                        System.out.print(": " + cs.getTransactions());
                    }
                    System.out.println();
                }
                break;
            }
        }
    }

}
