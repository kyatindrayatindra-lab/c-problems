class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rSize = matrix.length,cSize = matrix[0].length;
        int start = 0,end =rSize*cSize-1,mid=0;
        while(start<=end){
            mid = start+(end-start)/2;
            int row = mid/cSize;
            int col = mid%cSize;
            int value = matrix[row][col];
            if(value==target) return true;
            else if(target>value) start=mid+1;
            else end = mid-1;

        }
        return false;
    }
}
