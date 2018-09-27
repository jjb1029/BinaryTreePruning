class Solution {

	//Definition for a binary tree node.
	private class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) // base case
            return root;
        root.left = pruneTree(root.left); // goes left children
        root.right = pruneTree(root.right); // goes right children
        
        if(root.val == 0 && root.left == null && root.right == null)
            return null;
        
        return root;
    }
    
}