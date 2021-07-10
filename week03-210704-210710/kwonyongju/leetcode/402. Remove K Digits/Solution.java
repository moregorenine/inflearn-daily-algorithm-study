public class Solution {
  public String removeKdigits(String num, int k) {
    // Key point -> remove maxima
    Stack<Character> stack = new Stack<>();
    int len = num.length();
    
    for (char c : num.toCharArray()) {            
        while (!stack.isEmpty() && c < stack.peek() && k > 0) {
            stack.pop();
            k--;                
        }
        if (!stack.isEmpty() || c != '0') stack.push(c);
    }
    
    while (k > 0 && !stack.isEmpty()) {
        stack.pop();
        k--;            
    }
    
    if (stack.isEmpty()) return "0";

    StringBuilder sb = new StringBuilder(num);
    while(!stack.isEmpty()) {
        sb.setCharAt(len - 1, stack.peek());
        stack.pop();
        len -= 1;
    }
    
    return sb.substring(len);
    
    
    // if (num.length() == k) return "0";
    // int min = Integer.MAX_VALUE;
    // int minInx = -1;
    // String result = "";
   
    // Wrong logic
//         // find minimum value and its index
//         for (int i = 0; i < num.length(); ++i) {
//             int n = num.charAt(i);
//             if (n <= min) {
//                 min = n;
//                 minInx = i;
//             }
//         }
    
//         // remove all greater values before min
//         // remove the greatest value after min in order
//         for (int i = 0; i < num.length(); ++i) {
//             int n = num.charAt(i);
//             while (k > 0) {
//                 if (i < minInx && n > min) continue;
//                 if (i > minInx && ) 
//             }
//         }
    
    
    // can't filter "112" where the number removing is after k index
//         for (int i = 0; i <= k; ++i) {
//             int n = num.charAt(i);
//             if (n <= min) {
//                 min = n;
//                 minInx = i;
//             }
//         }
            
//         for (int i = 0; i < num.length(); ++i) {
//             char c = num.charAt(i);
//             if ((i > k) 
//                || (i <= k && i == minInx && c != '0'))
//                 result += c;
//         }
    
//         if (result.equals("")) return "0";
//         return result;
}  
}
