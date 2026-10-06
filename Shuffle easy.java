import java.util.*;

public class Main {
    static final long MOD = 998244353;

    static long power(long a, long b) {
        long result = 1;

        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }

            a = (a * a) % MOD;
            b /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            long fact = 1;

            for (int i = 1; i <= K; i++) {
                fact = (fact * i) % MOD;
            }

            long ans = (fact * power(K, N - K)) % MOD;

            System.out.println(ans);
        }

        sc.close();
    }
}
