class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar = arr[0];
        int slar = -1;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>lar){
                slar = lar;
                lar = arr[i];
            }
            else if(arr[i]>slar && arr[i]<lar){
                slar=arr[i];
            }
        }
        return slar;
    }
}
