
// HashMap with doubly-linked list
class LRUCache {
  class Node {
      Node prev;
      Node next;
      int key;
      int val;
      
      public Node(int key, int val) {
          this.key = key;
          this.val = val;
      } 
  }
  
  private Node head = new Node(0, 0);
  private Node tail = new Node(0, 0);
  private int capacity;
  private Map<Integer, Node> cache;
  
  public LRUCache(int capacity) {
      this.capacity = capacity;
      this.cache = new HashMap<>();
      head.next = tail;
      tail.next = head;
  }
  
  public int get(int key) {
      if (cache.containsKey(key)) {
          Node node = cache.get(key);
          remove(node);
          insert(node);
          return node.val;
      }
      return -1;
  }
  
  public void put(int key, int value) {
      Node newNode = new Node(key, value);
      
      if (cache.containsKey(key)) {
          Node origin = cache.get(key);
          remove(origin);
      }

      if (cache.size() == capacity) {
          // remove the least recently used node
          remove(tail.prev);
      }
      
      insert(newNode);
  }
  
  private void remove(Node node) {
      cache.remove(node.key);
      node.prev.next = node.next;
      node.next.prev = node.prev;
  }
  
  private void insert(Node node) {
      cache.put(node.key, node);
      Node headNext = head.next;
      head.next = node;
      headNext.prev = node;
      node.next = headNext;
      node.prev = head;
  }
}

// Time Limit Exceeded
class LRUCache {
    
  private int capacity;
  private Map<Integer, Integer> cache;
  private Deque<Integer> queue;

  public LRUCache(int capacity) {
      this.capacity = capacity;
      this.cache = new HashMap<>();
      this.queue = new LinkedList<>();
  }
  
  public int get(int key) {
      if (cache.containsKey(key)) {
          replaceInQueue(key);
          return cache.get(key);
      }
      return -1;
  }
  
  public void put(int key, int value) {
      if (!cache.containsKey(key)) {
          if (cache.size() == this.capacity) {
              int lru = queue.peekLast();
              // remove the least recently used key
              cache.remove(lru);
              queue.remove(lru);
          } 
      }
      
      if (cache.containsKey(key))
          cache.remove(key);
      
      cache.put(key, value);
      replaceInQueue(key);
  }
  
  private void replaceInQueue(int key) {
      queue.remove(key);
      queue.addFirst(key);
  }
}

/**
* Your LRUCache object will be instantiated and called as such:
* LRUCache obj = new LRUCache(capacity);
* int param_1 = obj.get(key);
* obj.put(key,value);
*/