import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mp = new MobilePhone();

    public static void main(String[] args) {

        boolean status = true;

        while (status) {
            defaultPrint();
            int operation = scanner.nextInt();
            scanner.nextLine();

            switch (operation) {
                case 0: break;
                case 1: addContact(); break;
                case 2: modifyContact(); break;
                case 3: removeContact(); break;
                case 4: queryContact(); break;
                default: status = false; break;
            }
        }

    }

    public static void defaultPrint() {
        System.out.println("Enter 1 to add new contact");
        System.out.println("Enter 2 to modify existing contact");
        System.out.println("Enter 3 to remove existing contact");
        System.out.println("Enter 4 to query existing contact");
        System.out.println("Enter 9 to End the program");

        System.out.print("Enter number: ");
    }

    public static void addContact() {
        System.out.print("Enter name of contact: ");
        String name = scanner.nextLine();

        System.out.print("Enter phoneNumber of contact: ");
        Integer phoneNumber = scanner.nextInt();

        mp.storeContact(name, phoneNumber);
    }

    public static void modifyContact() {
        System.out.print("Enter name of contact: ");
        String name = scanner.nextLine();

        System.out.print("Enter phoneNumber to change into: ");
        Integer phoneNumber = scanner.nextInt();
        scanner.nextLine();

        mp.modifyContact(name, phoneNumber);
    }

    public static void removeContact() {
        System.out.print("Enter name of contact: ");
        String name = scanner.nextLine();

        mp.removeContact(name);
    }

    public static void queryContact() {
        mp.queryContact();
    }

}
