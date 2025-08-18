class Solution {
    
    public static int merge(int[] arr , int low , int mid , int high){
        int cnt = 0;
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                cnt+=mid-left+1;
                temp.add(arr[right]);
                right++;
            }
        }
        
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }
        
        return cnt;
    }
    
    public static int mergesort(int[] arr , int low , int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = low + (high - low) /2;
        cnt += mergesort(arr,low,mid);
        cnt += mergesort(arr,mid+1,high);
        cnt += merge(arr,low,mid,high);
        return cnt;
    }
    
    static int inversionCount(int arr[]) {
        // Code Here
        int n = arr.length;
        
        return mergesort(arr,0,n-1);
    }
}
