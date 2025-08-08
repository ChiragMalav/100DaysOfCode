class Solution {
    public void rotate(int[][] matrix) {
        
        int top = 0;
        int bottom = matrix.length-1;

        while(top<bottom){
            for(int col=0;col<matrix.length;col++){
                int temp = matrix[top][col];
                matrix[top][col] = matrix[bottom][col];
                matrix[bottom][col] = temp;
            }
            top++;
            bottom--;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}s
