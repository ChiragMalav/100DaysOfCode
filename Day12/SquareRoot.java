class Solution {
    int floorSqrt(int n) {
        // code here
        if(n==1)return 1;
        if(n==0)return 0;
        int low = 1;
        int high = n;
        while(low<=high){
            int mid = (low+high)/2;
            
            if((mid*mid)<=n){
                low=mid+1;
            }
            else high=mid-1;
        }
        return high;
    }
}
