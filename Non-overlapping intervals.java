class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(r1,r2)->r1[1]-r2[1]);
        int count = 0,prev=Integer.MIN_VALUE;
        for(int[] row:intervals){
            int start = row[0],end = row[1];
            if(start<prev) count++;
            else prev = end;
        }
        return count;
    }
}
