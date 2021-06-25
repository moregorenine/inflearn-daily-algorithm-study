class Solution {
  public void sortColors(int[] nums) {       
      // 2-pass
        int rCount = 0, wCount = 0, bCount = 0;
      
        for (int color : nums) {
            switch (color) {
                case 0: rCount++; break;
                case 1: wCount++; break;
                case 2: bCount++; break;
            }
        }
      
        for (int i = 0; i < nums.length; ++i) {
            if (rCount-- > 0) nums[i] = 0;
            else if (wCount-- > 0) nums[i] = 1;
            else if (bCount-- > 0) nums[i] = 2;
        }        
      
      // 1-pass
      int len = nums.length;
      int left = 0;
      int right = len - 1;
      int current = 0;
      
      while(current <= right) {
          if (nums[current] == 0) {
              swap(nums, current, left);
              left++;
              current++;
          }
          
          else if (nums[current] == 1) {
              current++;
          }
          
          else if (nums[current] == 2) {
              swap(nums, current, right);
              right--;
          }
      }
  }
  
  private void swap(int[] nums, int cur, int mov) {
      int temp = nums[cur];
      nums[cur] = nums[mov];
      nums[mov] = temp;
  }
}