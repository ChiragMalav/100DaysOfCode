class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int left = binarySearch(arr,target,true);
        if(left==-1)return 0;
        int right = binarySearch(arr,target,false);
        return right-left+1;
    }
    int binarySearch(int[] arr,int target,boolean leftIndex){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>target){
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;

                if(leftIndex==true){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return ans; 
    }
}
