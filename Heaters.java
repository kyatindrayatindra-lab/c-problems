import java.util.Arrays;

class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int radius = 0;
        int trav = 0;
        int size = heaters.length;
        for (int house : houses) {
            while (trav < size - 1 && Math.abs(heaters[trav + 1] - house) <= Math.abs(heaters[trav] - house)) {
                trav++;
            }
            radius = Math.max(radius, Math.abs(heaters[trav] - house));
        }
        return radius;
    }
}
