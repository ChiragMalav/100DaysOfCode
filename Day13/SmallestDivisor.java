class Solution {
    public int find(int[] nums , int mid , int threshold){
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            count+=Math.ceil((double)nums[i]/(double)mid);
            
        }
        return count;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n>threshold)return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        int low = 1;
        int high = max;
        while(low<=high){
            int mid = (low+high)/2;
            int div = find(nums,mid,threshold);
            if(div <= threshold){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
