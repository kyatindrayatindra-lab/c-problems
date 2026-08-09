import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;

        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean first = true;

        for (int i = start; i <= end; i++) {
            if (isHappy(i)) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
        }
    }

    private static boolean isHappy(int num) {
        int temp = num;

        while (temp != 1 && temp != 4) {
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit;
                temp /= 10;
            }
            temp = sum;
        }

        return temp == 1;
    }
}
