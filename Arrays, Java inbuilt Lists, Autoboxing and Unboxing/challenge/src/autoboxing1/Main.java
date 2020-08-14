package autoboxing1;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank();

    public static void main(String[] args) {

        boolean progress = true;
        while (progress) {
            defaultMsg();
            int order = scanner.nextInt();
            scanner.nextLine();
            switch (order) {
                case 0: break;
                case 1: addBranch();break;
                case 2: addCustomer();break;
                case 3: addTransaction();break;
                case 4: queryBranch(); break;
                case 9: progress = false; break;
            }
        }
    }

    public static void defaultMsg() {
        System.out.println(
                "press 0 - show instruction again\n"
                + "press 1 - add Branch\n"
                + "press 2 - add Customer\n"
                + "press 3 - add Transaction\n"
                + "press 4 - query Branch\n"
                + "press 9 - end this program\n"
        );
    }

    public static void addBranch() {
        System.out.print("Name of new Branch: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    public static void addCustomer() {
        System.out.print("Name of Branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Name of newCustomer: ");
        String customerName = scanner.nextLine();
        System.out.print("Amount of initial Transaction: ");
        Double initialTranscation = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomer(branchName, customerName, initialTranscation);
    }

    public static void addTransaction() {
        System.out.print("Name of Branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Name of Customer: ");
        String customerName = scanner.nextLine();
        System.out.print("Amount of Transaction: ");
        Double transaction = scanner.nextDouble();
        scanner.nextLine();

        bank.addTransaction(branchName, customerName, transaction);
    }

    public static void queryBranch() {

        System.out.print("Name of Branch: ");
        String branchName = scanner.nextLine();
        System.out.print("Type Y if you want to query transactions also, N if not: ");
        boolean queryTransaction = (scanner.nextLine().equals("Y"));

        bank.queryBranch(branchName, queryTransaction);
    }
}
