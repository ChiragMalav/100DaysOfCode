class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        Arrays.sort(citations);
        int h = 0;
        for(int i=n-1;i>=0;i--){
            int papers = n-i;
            if(citations[i]>=papers){
                h=papers;
            }
            else{
                break;
            }
        }
        return h;
    }
}
