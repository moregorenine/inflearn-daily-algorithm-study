import java.util.HashMap;
import java.util.Map;

class Solution {
    // Divide and Conquer (should be more optimized)
    public int longestSubstring(String s, int k) {
        if (s.length() < k) return 0;
      
        return helper(s, k);
    }
  
    public int helper(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int partition = -1; 
      
        for (char c: s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else 
                map.put(c, 1);
        }

        for (char c: map.keySet())
            if (map.get(c) < k) partition = s.indexOf(c);
              
        if (partition < 0)     
            return s.length();
      
        return Math.max(helper(s.substring(0, partition), k), helper(s.substring(partition + 1, s.length()), k));
    }
  
  
      // Brute folce
//     // Time limit exceeded
//     public int longestSubstring(String s, int k) {
//         if (s.length() < k) return 0;
//         int max = 0;
      
//         for (int i = 0; i < s.length(); ++i) {
//             for (int j = i + 1; j < s.length() + 1; ++j) {
//                 if (j - i >= k) {
//                     String sub = s.substring(i, j);
//                     if (helper(sub, k) && sub.length() > max) max = sub.length(); 
//                 }
//             }
//         }
      
//         return max;
//     }
  
//     public boolean helper(String s, int k) {
//         Map<Character, Integer> map = new HashMap<>();
      
//         for (char c: s.toCharArray()) {
//             if (map.containsKey(c))
//                 map.put(c, map.get(c) + 1);
//             else 
//                 map.put(c, 1);
//         }
      
//         for (int i: map.values()) 
//             if (i < k) return false;            
      
//         return true;
//     }
}