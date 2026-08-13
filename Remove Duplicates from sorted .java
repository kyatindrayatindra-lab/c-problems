class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0) return 0;
        int index=0;
        for(int jack=1;jack<nums.length;jack++){
            if(nums[index]!=nums[jack]){
                index++;
                nums[index]=nums[jack];
            }
        }
        return index+1;
    }
}
