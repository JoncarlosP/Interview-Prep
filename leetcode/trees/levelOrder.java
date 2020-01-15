/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        while(!level.isEmpty()) {
            int size = level.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode current = level.remove();
                currentLevel.add(current.val);
                if(current.left != null) {
                    level.add(current.left);
                }
                if(current.right != null) {
                    level.add(current.right);
                }
            }
            result.add(currentLevel);
            
        }
        
        return result;
    }
}
