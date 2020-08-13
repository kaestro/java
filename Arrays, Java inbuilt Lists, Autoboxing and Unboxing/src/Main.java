import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        GroceryList gList = new GroceryList();
        gList.addGroceryItem(scanner.nextLine());
        gList.addGroceryItem(scanner.nextLine());
        gList.addGroceryItem(scanner.nextLine());
        gList.printGroceryList();

        gList.modifyGroceryItem(2, new String("hot dog"));
        gList.printGroceryList();

        gList.removeGroceryItem(0);
        gList.printGroceryList();
    }

}
