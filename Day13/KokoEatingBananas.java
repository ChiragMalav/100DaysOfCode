class Solution {
    public int calcTime(int[] piles,int mid){
        int count = 0;
        for(int i=0;i<piles.length;i++){
            count+= Math.ceil((double)piles[i] / (double)mid);
        }
        return count;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;
            int totalH = calcTime(piles,mid);

            if(totalH>h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }
}
