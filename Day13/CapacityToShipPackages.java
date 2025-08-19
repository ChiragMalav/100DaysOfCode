class Solution {
    public int calc(int[] arr , int cap){
        int days = 1;
        int load = 0;
        
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>cap){
                days+=1;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }    
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int high=0;
        int low = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            high+=weights[i];
            low = Math.max(low,weights[i]);
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            int noOfDay = calc(weights,mid);

            if(noOfDay>days){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
