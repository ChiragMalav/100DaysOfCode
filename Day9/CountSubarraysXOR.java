class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length;
        int cnt = 0;
        int xr = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(xr,1);
        
        for(int i=0;i<n;i++){
            xr=xr^arr[i];
            
            int x = xr^k;
            
            if(map.containsKey(x)){
                cnt+=map.get(x);
            }
            
            if(map.containsKey(xr)){
                map.put(xr,map.get(xr)+1);
            }
            else{
                map.put(xr,1);
            }
        }
        return (long) cnt;
    }
}
