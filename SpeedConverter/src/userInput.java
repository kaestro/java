import java.util.Scanner;

public class userInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        int age = 2020 - yearOfBirth;

        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        scanner.close();
    }
}
