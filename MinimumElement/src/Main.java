import java.lang.reflect.Array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = readIntegers(count);
        System.out.println("arrInt = " + Arrays.toString(arr));

        int minVal = findMin(arr);
        System.out.println(minVal);
        scanner.close();
    }

    private static int[] readIntegers(int count) {
        int[] result = new int[count];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; ++i) {
            result[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return result;
    }

    private static int findMin(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < minVal) {
                minVal = num;
            }
        }

        return minVal;
    }

}
