class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i] != arr[i-1]){
                ar.add(arr[i]);
            }
        }
        return ar;
    }
}
