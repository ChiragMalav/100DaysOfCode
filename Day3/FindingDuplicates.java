class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans=-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
