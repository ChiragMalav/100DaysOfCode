class Solution {
    public String largestGoodInteger(String num) {
        String best="";
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)){
                String triple = num.substring(i, i + 3);
                if(best.isEmpty() || triple.compareTo(best) > 0){
                    best=triple;
                }
            }
        }
        return best;
    }
}
