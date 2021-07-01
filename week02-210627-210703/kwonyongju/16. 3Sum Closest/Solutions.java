class Solution {
  public int threeSumClosest(int[] nums, int target) {
      // Two pointers
      int closest = Integer.MAX_VALUE, cur = 0;
      int threeSum = 0;
      int result = 0;
      
      Arrays.sort(nums);
      
      for (int i = 0; i < nums.length - 2; ++i) {
          int l = i + 1;
          int r = nums.length - 1;
          while (l < r) {
              threeSum = nums[i] + nums[l] + nums[r];
              
              cur = Math.abs(threeSum - target);
              
              if (cur < closest) {
                  closest = cur;
                  result = threeSum;
              }
              
              if (threeSum < target) l++;
              else if (threeSum > target) r--;
              else return target;
          }
      }        
      
      return result;
      
      
      // int cur = 0;
      // int min = Integer.MAX_VALUE;
      // int twoSum = 0;
      // int threeSum = 0;
      
      // Time Limit Exceeded

      // for (int i = 0; i < nums.length - 2; ++i) {
      //     for (int j = i + 1; j < nums.length - 1; ++j) {
      //         twoSum = nums[i] + nums[j];
      //         int k = j + 1;
      //         while (k < nums.length) {
      //             threeSum = twoSum + nums[k];
      //             cur = Math.abs(target - threeSum);
      //             if (cur < min) min = cur;
      //         }
      //     }
      // }
      
      // Time Limit Exceeded

      // for (int i = 0; i < nums.length - 2; ++i) {
      //     int j = i + 1;
      //     twoSum = nums[i] + nums[j];
      //     int k = j + 1;
      //     while (k < nums.length) {
      //         threeSum = twoSum + nums[k];
      //         cur = Math.abs(target - threeSum);
      //         if (cur < min) min = cur;
      //     }         
      // }
      
      // return min;
  }
}