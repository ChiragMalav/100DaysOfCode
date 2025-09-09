class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int right = n-1;
        int ans = 0;
        for(int i =0;i<n;i++){
            if(height[i]<height[n-1]){
                ans = Math.max(ans,height[i]*(n-1));
            }
            else{
                ans = Math.max(ans,height[right]*(n-i-1));
                right--;
            }
        }
        return ans;
    }
}
