class Solution {
    public boolean canJump(int[] arr) {
        int jump = 0;
        for(int index = 0;index<arr.length;index++){
            if(index>jump) return false;
            jump = Math.max(jump,index+arr[index]);
        }
        return true;
    }
}
