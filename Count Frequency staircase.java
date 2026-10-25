class Solution {
    public int countStaircase(int[] nums) {
        int n = nums.length, count = 0;
        for(int i = 0; i < n; i++){
            java.util.Map<Integer, Integer> map = new java.util.LinkedHashMap<>();
            for(int j = i; j < n; j++){
                map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                int idx = 1;
                boolean match = true;
                for(int freq : map.values()){
                    if(freq != idx++) { match = false; break; }
                }
                if(match) count++;
            }
        }
        return count;
    }
}
