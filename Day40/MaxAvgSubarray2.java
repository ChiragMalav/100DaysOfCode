// User function Template for Java

class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        int index = 0;
        int max_sum = 0;
        
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        
        max_sum = sum;
        
        for(int i=k; i<n; i++){
            sum += arr[i] - arr[i-k];
            if(sum > max_sum){
                index = i-k+1;
                max_sum = sum;
            }
        }
        
        return index;
    }
}
