class Solution {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }

        int[] prefix = new int[121];
        for (int i = 1; i <= 120; i++) {
            prefix[i] = prefix[i - 1] + count[i];
        }

        int totalRequests = 0;

        for (int i = 15; i <= 120; i++) {
            if (count[i] == 0) continue;

            int minAge = (int) (0.5 * i + 7);
            int validTargets = prefix[i] - prefix[minAge];
            
            totalRequests += count[i] * (validTargets - 1);
        }

        return totalRequests;
    }
}
