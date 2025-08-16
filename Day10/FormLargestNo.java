class Solution {
    public String findLargest(int[] arr) {
        // code here
        String[] strArr = new String[arr.length];
        int n =arr.length;
        
        for(int i=0;i<n;i++){
            strArr[i] = String.valueOf(arr[i]);
        }
        
        Arrays.sort(strArr,(a,b) -> (b+a).compareTo(a+b));
        
        if(strArr[0].equals("0"))return "0";
        
        StringBuilder result = new StringBuilder();
        
        for(String str : strArr){
            result.append(str);
        }
        
        return result.toString();
    }
}
