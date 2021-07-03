import java.util.ArrayList;
import java.util.List;

// backtracking 
class Solution {
  public List<String> letterCombinations(String digits) { 
      String[] letters = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
      List<String> result = new ArrayList<>();
      
      if (digits.length() == 0) return result;
      
      backtrack(digits.toCharArray(), letters, "", result);
      
      return result;
  }
  
  private void backtrack(char[] digits, String[] letters, String cur, List<String> result) {
      if (cur.length() == digits.length) {
          result.add(cur);
          return;
      }

      int i = cur.length();
      int letterInx = digits[i] - '0';
      
      for (char c: letters[letterInx].toCharArray()) {
          backtrack(digits, letters, cur + c, result);
      }
  }
  
//     public List<String> letterCombinations(String digits) {
//         if (digits.length() == 0) return new ArrayList<>();
      
//         Map<Character, List<Character>> map = new HashMap<>();
//         List<String> result = new ArrayList<>();
      
//         initializeMap(map);
      
//         helper(digits, new String(), map, result, 0);
      
//         return result;
//     }
  
//     private void helper(String digits, String cur, Map<Character, List<Character>> map, List<String> result, int pos) {
//         if (cur.length() == digits.length()) {
//             result.add(cur);
//             return;
//         }
      
//         for (char c: map.get(digits.charAt(pos))) {
//             helper(digits, cur + c, map, result, pos + 1);
//         }
//     }
  
//     private void initializeMap(Map<Character, List<Character>> map) {
//         int key = 2;
      
//         for (int i = 0; i < 26; ++i) {
//             char charKey = (char) ('0' + key);
//             Character c = (char)('a' + i);
          
//             if (map.get(charKey) == null) map.put(charKey, new ArrayList<>());

//             List<Character> chars = map.get(charKey);
//             if (!(key == 7 || key == 9) && chars.size() < 3) {
//                 chars.add(c);
//                 map.put(charKey, chars);
//                 if (chars.size() == 3) key++;         
//             }
//             else if ((key == 7 || key == 9) && chars.size() < 4) {
//                 chars.add(c);
//                 map.put(charKey, chars);
//                 if (chars.size() == 4) key++;
//             }
//         }
//     }
}