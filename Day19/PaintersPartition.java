class Solution {
    public int calc(int[] arr, int mid){
        int n = arr.length;
        int painters = 1;
        int time = 0;
        for(int i=0;i<n;i++){
            if(time+arr[i]<=mid){
                time+=arr[i];
            }
            else{
                painters++;
                time=arr[i];
            }
        }
        return painters;
    }
    
    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i =0;i<n;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            int painters = calc(arr,mid);
            if(painters<=k){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
