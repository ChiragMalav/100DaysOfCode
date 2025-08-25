// User function Template for Java

class Solution {
    public int lowerBound(int[] arr,int m , int k){
        int low = 0;
        int high = m-1;
        int ans = m;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=k){
                ans = mid;
                high = mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    
    public int rowWithMax1s(int arr[][]) {
        // code here
        int n = arr.length;
        int m = arr[0].length;
        int max1s = 0;
        int index = -1;
        
        for(int i=0;i<n;i++){
            int cnt_ones = m - lowerBound(arr[i],m,1);
            if(cnt_ones>max1s){
                max1s = cnt_ones;
                index = i;
            }
        }
        return index;
    }
}
