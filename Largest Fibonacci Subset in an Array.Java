import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int a = 0, b = 1;

            while (b < x) {
                int t = a + b;
                a = b;
                b = t;
            }

            if (x == 0 || x == 1 || x == b)
                c++;
        }

        System.out.println(c >= 2 ? c : -1);
    }
}
