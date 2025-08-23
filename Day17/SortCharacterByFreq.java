class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Character> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());

        String ans = "";

        while(!values.isEmpty()){
            int max = Collections.max(values);
            int index = values.indexOf(max);
            char ch = keys.get(index);

            for(int i=0;i<max;i++){
                ans+=ch;
            }

            keys.remove(index);
            values.remove(index);
        }

        return ans;
        
    }
}
