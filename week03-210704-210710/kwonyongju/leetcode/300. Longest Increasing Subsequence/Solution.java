class Solution {
  public int lengthOfLIS(int[] nums) {
    // Dynamic programming (O(n^2))
    int[] lis = new int[nums.length];
    Arrays.fill(lis, 1);
    int max = 0;
    
    for (int i = nums.length - 1; i >= 0; --i)
        for (int j = i + 1; j < nums.length; ++j) 
            if (nums[i] < nums[j]) lis[i] = Math.max(lis[i], 1 + lis[j]);
        if (lis[i] > max) max = lis[i];

    return max;

    // Dynamic programming (O(nlog(n)))
    // don't think I can come up with this idea during the interview, need to practice 
    // int[] tails = new int[nums.length];
    // int size = 0;
    // for (int x : nums) {
    //     int i = 0, j = size;
    //     while (i != j) {
    //         int m = (i + j) / 2;
    //         if (tails[m] < x)
    //             i = m + 1;
    //         else
    //             j = m;
    //     }
    //     tails[i] = x;
    //     if (i == size) ++size;
    // }
    // return size;     
      

    // Brute force, won't work
    // int maxLen = 1;
    // for (int i = 0; i < nums.length - 1; ++i) {
    //   int cur = nums[i];
    //   int curLen = 1;

    //   for (int j = i + 1; j < nums.length; ++j) {
    //       if (nums[j] > cur) {
    //           cur = nums[j];
    //           curLen++;
    //       }
        
    //       if (curLen > maxLen) maxLen = curLen;
    //   }
    // }

    // return maxLen;
  }

}