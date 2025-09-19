class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        for(int i=2*n-1 ; i>=0;i--){
            int curr = nums[i%n];
            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(i<n){
                nge[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(curr);
        }
        return nge;
    }
}
