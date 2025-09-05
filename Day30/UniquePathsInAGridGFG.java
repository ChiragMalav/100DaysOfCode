class Solution {
    public int uniquePaths(int[][] grid) {
        // code here
        int n = grid.length;
        int m = grid[0].length;
        
        if(grid[0][0] == 1 || grid[n-1][m-1] == 1)return 0;
        
        grid[0][0] =1;
        
        for(int i =1;i<n;i++){
            grid[i][0] = (grid[i][0] == 0 && grid[i-1][0]==1) ? 1 : 0;
        }
        
        for(int i =1;i<m;i++){
            grid[0][i] = (grid[0][i] == 0 && grid[0][i-1]==1) ? 1 : 0;
        }
        
        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                }
                else{
                    grid[i][j] = grid[i-1][j] +grid[i][j-1];
                }
            }
        }
        return grid[n-1][m-1];
    }
};
