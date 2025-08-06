class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        
        for(int num : arr){
            map.put(num , map.getOrDefault(num,0)+1);
        }
        int maxFreq = 0;
        int maxElem = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int num = entry.getKey();
            int freq = entry.getValue();
            if(freq>maxFreq){
                maxFreq = freq;
                maxElem = num;
            }
            else if(freq == maxFreq){
                maxElem = Math.max(maxElem , num);
            }
            
        }

        return maxElem;
    }
}
