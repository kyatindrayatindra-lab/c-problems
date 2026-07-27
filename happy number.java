import java.util.HashSet;
import java.util.Set;

class Solution {
    private int sum(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }

    public boolean isHappy(int number) {
        Set<Integer> st = new HashSet<>();
        while (number != 1 && !st.contains(number)) {
            st.add(number);
            number = sum(number);
        }
        return number == 1;
    }
}
