class Solution {
    public boolean containsZero(int b){
        String s = String.valueOf(b);

        char[] ch = s.toCharArray();

        for(char i : ch){
            if(i=='0'){
                return true;
            }
        }
        return false;
    }

    public int[] getNoZeroIntegers(int n) {
        int a = 1;
        int[] ans = new int[2];
        while(containsZero(n-a) || containsZero(a)){
            a++;
        }
        ans[0] = a;
        ans[1] = n-a;
        return ans;
    }
}
