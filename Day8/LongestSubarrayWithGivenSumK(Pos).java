// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        int max_len=0;
        
        for(int i=0;i<n;i++){
            sum+=arr[i];
            
            if(sum==k){
                max_len = Math.max(max_len,i+1);
            }
            
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            
            if(map.containsKey(sum-k)){
                max_len = Math.max(max_len,i-map.get(sum-k));
            }
        }
        return max_len;
    }
}
