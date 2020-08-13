import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[] {1,2,3,4,5};
        System.out.println("original arr = " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("reversed arr = " + Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; ++i) {
            int left = arr[i];
            int right = arr[arr.length - 1 - i];
            arr[i] = right;
            arr[arr.length - 1 - i] = left;
        }
    }
}
