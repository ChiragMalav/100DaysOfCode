class Solution {
    public int maxEle(int[][] mat,int mid){
        int n = mat.length;
        int index = -1;
        int maxEle = -1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxEle){
                maxEle = mat[i][mid];
                index = i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;
        int[] ans = {-1,-1};
        while (low <= high) {
            int mid = (low + high) / 2;

            int maxRowIndex = maxEle(mat,mid);
            int left = (mid-1)>=0?mat[maxRowIndex][mid-1] : -1;
            int right = (mid+1)<m?mat[maxRowIndex][mid+1] : -1;

            if(mat[maxRowIndex][mid]>left && mat[maxRowIndex][mid]>right){
                ans[0]=maxRowIndex;
                ans[1]=mid;
                break;
            }
            else if(mat[maxRowIndex][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
