import java.util.ArrayList;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        for (int i = 3; i <= number; ++i) {
            boolean isPrime = true;
            for (Integer prime : primes) {
                if (i % prime == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        int ans = 0;
        for (Integer prime : primes) {
            if (number % prime == 0) {
                ans = prime;
            }
        }

        return ans;
    }
}
