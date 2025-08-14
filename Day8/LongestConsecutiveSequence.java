class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums.length==0)return 0;
        int count=1;
        int maxSeq=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]+1==nums[i+1]){
                count+=1;
            }
            else if(nums[i] == nums[i+1]) {
                continue; // same number skip
            }
            else{
                count=1;

            }
            maxSeq=Math.max(maxSeq,count);
        }
        return maxSeq;
    }
}
