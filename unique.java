class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m+1][n+1];
        for(int ind=0;ind<m;ind++) grid[ind][0]=1;
         for(int ind=0;ind<n;ind++) grid[0][ind]=1;
         for(int rIn=1;rIn<m;rIn++){
            for(int cIn=1;cIn<n;cIn++){
                grid[rIn][cIn] = grid[rIn][cIn-1]+grid[rIn-1][cIn];
            }
         }
         
        return grid[m-1][n-1];

    }
}
