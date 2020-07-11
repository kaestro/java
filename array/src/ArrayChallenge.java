import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        int arr_size = scanner.nextInt();
        int[] arr = new int[arr_size];
        for (int i = 0; i < arr_size; ++i) {
            arr[i] = scanner.nextInt();
        }

        for (int num : arr) {
            System.out.println(num);
        }

        sort_arr(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static void sort_arr(int[] arr) {
        Arrays.sort(arr);
    }
}
