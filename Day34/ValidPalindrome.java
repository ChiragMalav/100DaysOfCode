class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] ch = result.toCharArray();
        int n = ch.length;
        for(int i=0;i<n/2;i++){
            if(ch[i]!=ch[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
