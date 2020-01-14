/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Time Complexity: O(n) Space Complexity: O(n)
class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        int count = 0;
        if(root == null) {
            return count;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.remove();
                if(curr.val >= L && curr.val <= R) {
                    count += curr.val;
                }
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
        return count;
    }
}
