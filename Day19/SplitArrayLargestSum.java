class Solution {
    public int calc(int[] nums , int mid ){
        int n = nums.length;
        int sum=0;
        int partitions=1;
        for(int i=0;i<n;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                partitions++;
                sum=nums[i];
            }
        }
        return partitions;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0;i<n;i++){
            low = Math.max(low,nums[i]);
            high += nums[i];
        }
        while(low<=high){
            int mid = (low+high)/2;
            int partitions = calc(nums,mid);
            if(partitions>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
