class Solution {
    
    public int noOfStudents(int[] arr , int k , int mid){
        int n = arr.length;
        int students = 1;
        int pages=0;
        for(int i=0;i<n;i++){
            if(pages+arr[i]<=mid){
                pages+=arr[i];
            }
            else{
                students++;
                pages=arr[i];
            }
        }
        return students;
    }
    
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(k>n)return-1;
        
        int low = Integer.MIN_VALUE;
        int high = 0;
        
        for(int i=0;i<n;i++){
            low = Math.max(low,arr[i]);
            high+=arr[i];
        }
        
        while(low<=high){
            int mid = (low+high)/2;
            int students = noOfStudents(arr,k,mid);
            
            if(students>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
