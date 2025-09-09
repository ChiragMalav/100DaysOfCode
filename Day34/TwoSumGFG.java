class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0 ;
        int right = n-1;
        
        while(left<right){
            if(arr[left]+arr[right]==target){
                return true;
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}
