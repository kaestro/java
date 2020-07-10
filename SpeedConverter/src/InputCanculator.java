import java.util.Scanner;

public class InputCanculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0, cnt = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt(); scanner.nextLine();
                ++cnt;
            } else {
                long avg = cnt == 0 ? 0 : Math.round(((double)sum / cnt));
                System.out.println("SUM = " + sum + " AVG = " + avg);
                scanner.close();
                break;
            }
        }
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
