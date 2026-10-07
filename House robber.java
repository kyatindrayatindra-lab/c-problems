class Solution {
    public int rob(int[] nums) {
        if(nums==null||nums.length==0) return 0;
         if(nums.length==1) return nums[0];
         int prev1 = Math.max(nums[0],nums[1]),prev2 = nums[0];
         for(int ind=2;ind<nums.length;ind++){
            int sum = Math.max(prev1,prev2+nums[ind]);
            prev2=prev1;
            prev1 = sum;
        
         }
         return prev1;
    }
}
