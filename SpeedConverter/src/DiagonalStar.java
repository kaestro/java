import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        ArrayList<String> ans = new ArrayList<String>();
        boolean isOdd = (number % 2) == 1;

        char[] chars = new char[number];
        Arrays.fill(chars, '*');
        ans.add(new String(chars));

        for (int i = 1; i < number/2; ++i) {
            char[] temp = new char[number];
            Arrays.fill(temp, ' ');
            temp[0] = '*';
            temp[i] = '*';
            temp[number - 1] = '*';
            temp[number - i - 1] = '*';
            ans.add(new String(temp));
        }

        for (String line : ans) {
            System.out.println(line);
        }

        if (isOdd) {
            char[] temp = new char[number];
            Arrays.fill(temp, ' ');
            temp[0] = '*';
            temp[number - 1] = '*';
            temp[number / 2] = '*';
            System.out.println(temp);
        }

        Collections.reverse(ans);
        for (String line : ans) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        printSquareStar(3);
        printSquareStar(5);
        printSquareStar(6);
        printSquareStar(7);
        printSquareStar(8);
    }
}
