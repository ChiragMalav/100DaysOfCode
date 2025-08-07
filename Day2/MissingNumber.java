class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]!=0){
            return 0;
        }
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]+1){
                return nums[i-1]+1;
            }
        }
        return nums[n-1]+1;
    }
}

we can also do total sum - actual sum thats the clean code
