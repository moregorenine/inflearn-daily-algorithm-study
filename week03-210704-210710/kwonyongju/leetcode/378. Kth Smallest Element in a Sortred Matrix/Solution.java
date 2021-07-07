class Solution {
  // find an element -> always think about binary search first!!
  public int kthSmallest(int[][] matrix, int k) {
    // Binary search w/ counting
    int len = matrix.length;
    int min = matrix[0][0];
    int max = matrix[len - 1][len - 1];
    
    while (min < max) {
        int mid = (max + min) / 2;
        if (count(mid, matrix) < k) min = mid + 1;
        else max = mid;
    }
    
    return max;

  // Time Limit Exceeded    
  //     int len = matrix.length;
  //     Stack<Integer> stack = new Stack<>();
      
  //     for (int i = 0; i < len; ++i) {
  //         for (int j = 0; j < len; ++j) {
  //             int cur = matrix[i][j];
  //             int max = stack.isEmpty() ? cur : stack.peek();
              
  //             List<Integer> list = new ArrayList<>();

  //             while (max > cur) {
  //                 list.add(0, stack.pop());
  //                 max = stack.peek();
  //             }
              
  //             stack.push(cur);
              
  //             for (int t: list) stack.push(t);
  //         }
  //     }
      
  //     while (stack.size() > k) stack.pop();
      
  //     return stack.peek();
  }

  private int count(int mid, int[][] matrix) {
    int len = matrix.length;
    int row = 0;
    int col = len - 1;
    int count = 0;
    
    while (row < len && col >= 0) {
        if (matrix[row][col] <= mid) {
            row++;
            count += col + 1;
        }
        else col--;
    }
    
    return count;
  }
}