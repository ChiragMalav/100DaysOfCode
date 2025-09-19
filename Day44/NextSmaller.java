class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>=arr[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        for(int i =0;i<n;i++){
            list.add(ans[i]);
        }
        return list;
    }
}
