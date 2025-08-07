class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int n =a.length;
        int m =b.length;
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int i=0;i<m;i++){
            set.add(b[i]);
        }
        for(int i : set){
            ans.add(i);
        }
        ans.sort(null);
        return ans;
    }
}
