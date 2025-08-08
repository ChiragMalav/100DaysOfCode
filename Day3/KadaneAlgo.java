class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        int sum =0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=0;
            }
            sum+=nums[i];
            ans=Math.max(sum,ans);
        }
        return ans;
    }
}
