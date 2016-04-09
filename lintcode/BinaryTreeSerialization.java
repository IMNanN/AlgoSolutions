/*
 * Design an algorithm and write code to serialize and deserialize a binary 
 * tree. Writing the tree to a file is called 'serialization' and reading 
 * back from the file to reconstruct the exact same binary tree is 
 * 'deserialization'.

There is no limit of how you deserialize or serialize a binary tree, you only 
need to make sure you can serialize a binary tree to a string and deserialize 
this string to the original structure.

Example
An example of testdata: Binary tree {3,9,20,#,#,15,7}, denote the following 
structure:

  3
 / \
9  20
  /  \
 15   7
Our data serialization use bfs traversal. This is just for when you got wrong 
answer and want to debug the input.

You can use other method to do serializaiton and deserialization.
 */
/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class BinaryTreeSerialization {

    /**
     * This method will be invoked first, you should design your own algorithm 
     * to serialize a binary tree which denote by a root node to a string which
     * can be easily deserialized by your own "deserialize" method later.
     */
    public String serialize(TreeNode root) {
        if (root == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List<TreeNode> curLevel = new LinkedList<TreeNode>();
        List<TreeNode> nextLevel = new LinkedList<TreeNode>();
        curLevel.add(root);
        while (!curLevel.isEmpty()) {
            TreeNode node = curLevel.poll();
            if (node != null) {
                sb.append(",").append(node.val);
                nextLevel.add(node.left);
                nextLevel.add(node.right);
            }
            if (curLevel.isEmpty()) {
                curLevel = nextLevel;
                nextLevel = new LinkedList<TreeNode>();
            }
        }
        return sb.substring(1).toString();
    }

    /**
     * This method will be invoked second, the argument data is what exactly
     * you serialized at method "serialize", that means the data is not given by
     * system, it's given by your own serialize method. So the format of data is
     * designed by yourself, and deserialize it here as you serialize it in 
     * "serialize" method.
     */
    public TreeNode deserialize(String data) {

    }

}
