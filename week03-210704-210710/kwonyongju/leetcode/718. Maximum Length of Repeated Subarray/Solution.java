class Solution {

  // Dynamic programming (optimized)
  public int findLength(int[] nums1, int[] nums2) {
    int len1 = nums1.length;
    int len2 = nums2.length;
    int[][] dp = new int[len1 + 1][len2 + 1];
    int ans = 0;
    
    for (int i = 0; i < len1; ++i) {
        for (int j = 0; j < len2; ++j) {
            if (nums1[i] != nums2[j]) continue;
            dp[i+1][j+1] = dp[i][j] + 1;
            ans = Math.max(ans, dp[i+1][j+1]);
        }
    }
      
    return ans;        
  }

  // Dynamic programming
//   public int findLength(int[] nums1, int[] nums2) {
//     int len1 = nums1.length;
//     int len2 = nums2.length;
//     int[][] dp = new int[len1][len2];
//     int ans = 0;
    
//     for (int i = 0; i < len1; ++i) 
//         dp[i][0] = nums1[i] == nums2[0] ? 1 : 0;
    
//     for (int j = 0; j < len2; ++j)
//         dp[0][j] = nums1[0] == nums2[j] ? 1 : 0;
    
//     for (int i = 1; i < len1; ++i) {
//         for (int j = 1; j < len2; ++j) {
//             if (nums1[i] != nums2[j]) continue;
//             dp[i][j] = dp[i-1][j-1] + 1;
//             ans = Math.max(ans, dp[i][j]);
//         }
//     }
    
//     return ans;        
// }
  
  // Brute force -> Time limit exceeded
  // public int findLength(int[] nums1, int[] nums2) {
  //     int max = 0, cur = 0;
  //     int len1 = nums1.length;
  //     int len2 = nums2.length;
      
  //     for (int i = 0; i < len1; ++i) {
  //         for (int j = 0; j < len2; ++j) {
  //             int i2 = i;
  //             int j2 = j;
  //             // System.out.printf("i2: %d, j: %d, nums1[i2]: %d, nums2[j2]: %d\n", i2, j2, nums1[i2], nums2[j2]);
  //             while (i2 < len1 && j2 < len2 && nums1[i2] == nums2[j2]) {
  //                 cur++;
  //                 i2++;
  //                 j2++;
  //             }
  //             // System.out.println("cur: " + cur);                
  //             if (cur > max) max = cur;
  //             cur = 0;
  //         }
          
  //     }
  //     return max;
  // }
}