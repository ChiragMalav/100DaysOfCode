class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = 0;
        int m = matrix[0].length-1;
        while(n<matrix.length && m>=0){
            if(target == matrix[n][m]){
                return true;
            }
            else if(matrix[n][m]>target){
                m--;
            }
            else{
                n++;
            }
        }
        return false;
    }    
}
