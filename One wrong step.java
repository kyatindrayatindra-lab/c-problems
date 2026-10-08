import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();

            int x = 0, y = 0;

            for (char c : s.toCharArray()) {
                if (c == 'U')
                    y++;
                else if (c == 'D')
                    y--;
                else if (c == 'L')
                    x--;
                else if (c == 'R')
                    x++;
            }

            if (Math.abs(x) + Math.abs(y) == 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
