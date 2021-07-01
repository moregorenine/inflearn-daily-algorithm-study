class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {        
      Map<Integer, List<Integer>> map = new HashMap<>();
      Set<Integer> set = new HashSet<>();
      
      for (int i = 0; i < numCourses; ++i) {
          List<Integer> reqList = new ArrayList<>();
          map.put(i, reqList);
      }
      
      for (int i = 0; i < prerequisites.length; ++i) {
          int course = prerequisites[i][0];
          int req = prerequisites[i][1];
          
          map.get(course).add(req);
          map.put(course, map.get(course));
      }
      
      for (int i = 0; i < numCourses; ++i)
          if (!helper(map, set, i)) return false;    
      
      return true;
      
      // won't work for not fully-connected graph
      // return helper(map, set, 0);
  }
  
  private boolean helper(Map<Integer, List<Integer>> map, 
                        Set<Integer> set, int course) {
      if (set.contains(course)) return false;
      if (map.get(course).size() == 0) return true;
      
      set.add(course);
      for (int i: map.get(course)) {
          if (!helper(map, set, i)) return false;
          set.remove(course);
      }
      
      map.put(course, new ArrayList< Integer>());
      return true;
  }
}