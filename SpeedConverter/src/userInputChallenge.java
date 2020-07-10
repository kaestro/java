import java.util.Scanner;
import java.util.regex.Pattern;

public class userInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;
        while (counter <= 10) {
            System.out.println("Enter number #" + counter + ":");
            if (scanner.hasNextInt()) {
                ++counter;
                sum += scanner.nextInt();
            }
            scanner.nextLine();
        }

        scanner.close();
        System.out.println("Sum of 10 input numbers: " + sum);
    }
}
