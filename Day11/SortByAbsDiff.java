class Solution {
    public void rearrange(int[] arr, int x) {
        // code here
        int n = arr.length;
        
        List<int[]> list = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            list.add(new int[]{arr[i],i});
        }
        
        list.sort((a,b) ->{
           int diffA = Math.abs(a[0]-x);
           int diffB = Math.abs(b[0]-x);
           if(diffA!=diffB){
               return Integer.compare(diffA,diffB);
           }
           else{
               return Integer.compare(a[1],b[1]);
           }
        });
        
        for(int i=0;i<n;i++){
            arr[i] = list.get(i)[0];
        }
        
    }
}
