class Solution {
    public boolean canWePlace(int[] stalls, int mid , int cows){
        int n = stalls.length;
        int countCows = 1;
        int last = stalls[0];
        
        for(int i=1;i<n;i++){
            if(stalls[i]-last>=mid){
                countCows++;
                last = stalls[i];
            }
        }
        if(countCows>=cows)return true;
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        
        int low = 1 , high = stalls[n-1]-stalls[0];
        
        while(low<=high){
            int mid = (low+high)/2;
            if(canWePlace(stalls,mid,k)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}
