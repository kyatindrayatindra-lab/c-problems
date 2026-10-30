import java.util.HashMap;
import java.util.Map;

class LRUCache {
    
    // Doubly Linked List Node structure
    private class Node {
        int key;
        int value;
        Node prev;
        Node next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    
    private int capacity;
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        
        // Initialize dummy head and tail nodes to eliminate edge cases
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        Node node = map.get(key);
        // Accessing the node makes it the most recently used
        remove(node);
        insertToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertToFront(node);
        } else {
            if (map.size() == capacity) {
                // Evict the least recently used item (the node just before tail)
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            map.put(key, newNode);
            insertToFront(newNode);
        }
    }
    
    // Helper method to remove a node from the linked list
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    // Helper method to insert a node right after the head (most recently used position)
    private void insertToFront(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
}
