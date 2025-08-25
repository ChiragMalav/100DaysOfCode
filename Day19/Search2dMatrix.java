class Solution {
    public boolean isThere(int[] matrix , int target){
        int n = matrix.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]>target){
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n =matrix.length;
        int m = matrix[0].length;

        for(int i=0;i<n;i++){
            if(isThere(matrix[i],target)){
                return true;
            }
        }
        return false;
    }
}
