class Solution {
    public boolean Possible(int[] arr , int mid , int m ,int k){
        int count = 0;
        int noOfBoq = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
            }
            else{
                noOfBoq+=count/k;
                count=0;
            }
        }
        noOfBoq+=count/k;
        if(noOfBoq>=m)return true;
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m *k;
        int n = bloomDay.length;

        if(val>n)return -1;

        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min = Math.min(min,bloomDay[i]);
            max = Math.max(max,bloomDay[i]);
        }

        int low = min;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            if(Possible(bloomDay,mid,m,k)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return low;
    }
}
