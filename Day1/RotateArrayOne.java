class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        }
        arr[0]=arr1[arr1.length-1];
        for(int i=1;i<arr1.length;i++){
            arr[i]=arr1[i-1];
        }
    }
}
