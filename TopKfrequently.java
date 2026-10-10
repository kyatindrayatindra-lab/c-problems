import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        return map.entrySet().stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
