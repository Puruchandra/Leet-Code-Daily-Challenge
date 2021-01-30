/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // Encode x,y,val in an int using 31 bits
    // Limit is 1000 entries in tree    
    static final int XBITS = 11; // X can range between -999 and 999 for a range of 1999
    static final int YBITS = 10; // Y can range between 0 and -999 for a range of 1000
    static final int VALBITS = 10; // Val can range between 0 and 1000 for a range of 1001
    
    // Shifts for different parts of priority queue entry
    static final int XSHIFT = VALBITS+YBITS; // Store X in most significant position
    static final int YSHIFT = VALBITS; // Store Y above val so it sorts before val
    static final int XMASK = (1<<XBITS) - 1;
    static final int XMASKRAW = XMASK<<XSHIFT;
    static final int VALMASK = (1<<VALBITS) - 1;
    // Initial X,Y values can be anything
    static final int STARTX = 1000; // Ensures X is always >=0
    static final int STARTY = 0; // Ensures Y is always >=0
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Initialize Priority Queue
        // O(N) Space as store all values in priority queue
        Queue<Integer> pq = new PriorityQueue<>();
        // O(Nlog(N)) time as insert is O(log(N)) and we do it N times
        addNode(pq, root, STARTX, STARTY);
        
        // Create results list and initial result
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> current = new LinkedList<>();
        
        // Add lowest X entry to initial result
        // O(log(N)) time to remove and O(1) for add
        int code = pq.remove();
        current.add(code & VALMASK);
        int lastx = code & XMASKRAW;
        
        // Iterate over all entries in queue
        // O(Nlog(N)) time to remove as O(log(N)) done N times
        // O(N) space for linked lists
        while (!pq.isEmpty()) {
            // O(log(N)) time
            code = pq.remove();
            int x = code & XMASKRAW;
            if (x != lastx) {
                // O(1) to add
                result.add(current);
                current = new LinkedList<>();
                lastx = x;
            }
            current.add(code & VALMASK);
        }
        result.add(current);
        return result;
    }
    
    private void addNode(Queue<Integer> pq, TreeNode node, int x, int y) {
        if (node == null)
            return;
        // Encode X,Y and Val into a 31-bit value
        // O(log(N)) Time to add to priority queue
        pq.add(x<<XSHIFT | y<<YSHIFT | node.val);
        addNode(pq, node.left, x-1, y+1);
        addNode(pq, node.right, x+1, y+1);
    }
}
