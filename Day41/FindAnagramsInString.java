class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();

        // Build frequency map for pattern p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int i = 0, j = 0;  // Sliding window pointers
        int n = s.length();
        int count = map.size();  // Number of unique characters to match

        while (j < n) {
            char ch = s.charAt(j);
            
            // Expand window: include character at j
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;  // One character frequency matched completely
                }
            }

            // Contract window: if window size > p.length()
            if (j - i + 1 > p.length()) {
                char left = s.charAt(i);
                if (map.containsKey(left)) {
                    if (map.get(left) == 0) count++;  // This character will become unmatched
                    map.put(left, map.get(left) + 1);
                }
                i++;  // Shrink window from left
            }

            // Check if current window is an anagram
            if (count == 0 && j - i + 1 == p.length()) {
                list.add(i);
            }

            j++;  // Always expand window to right
        }

        return list;
    }
}
