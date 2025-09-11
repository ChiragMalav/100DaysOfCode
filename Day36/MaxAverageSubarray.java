class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double windowSum = 0;
        double sum = 0;
        for(int i =0;i<k;i++){
            sum+=nums[i];
        }
        windowSum = sum;
        for(int i=k;i<n;i++){
            sum = sum - nums[i-k]+nums[i];
            windowSum = Math.max(windowSum,sum);
        }
        return windowSum/k;
    }
}
