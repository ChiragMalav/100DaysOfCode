class Solution {
    public static int countSubstring(String s) {
        // code here
        int[] last = {-1,-1,-1};
        int cnt = 0;
        
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
            if(last[0]!=-1 && last[1]!=-1 && last[2]!=-1){
                cnt+= 1 + Math.min(Math.min(last[0],last[1]),last[2]);
            }
        }
        return cnt;
    }
}
