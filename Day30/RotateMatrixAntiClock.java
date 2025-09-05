class Solution {
    public void rotateMatrix(int[][] mat) {
        // code here
        int top = 0;
        int row = mat.length;
        int bottom = row-1;
        int col = mat[0].length-1;
        
        
        while(top<bottom){
            for(int i = 0;i<=col;i++){
                int temp = mat[i][top];
                mat[i][top] = mat[i][bottom];
                mat[i][bottom] = temp;
            }
            top++;
            bottom--;
        }
        
        for(int i =0;i<row;i++){
            for(int j = i+1;j<=col;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
