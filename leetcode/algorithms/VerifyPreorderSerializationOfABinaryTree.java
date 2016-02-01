/*
 * One way to serialize a binary tree is to use pre-order 
 * traversal. When we encounter a non-null node, we record 
 * the node's value. If it is a null node, we record using 
 * a sentinel value such as #.
 * 
 *      _9_
 *     /   \
 *    3     2
 *   / \   / \
 *  4   1  #  6
 * / \ / \   / \
 * # # # #   # #
 * For example, the above binary tree can be serialized to 
 * the string "9,3,4,#,#,1,#,#,2,#,6,#,#", where # 
 * represents a null node.
 * 
 * Given a string of comma separated values, verify whether 
 * it is a correct preorder traversal serialization of a 
 * binary tree. Find an algorithm without reconstructing 
 * the tree.
 * 
 * Each comma separated value in the string must be either 
 * an integer or a character '#' representing null pointer.
 * 
 * You may assume that the input format is always valid, 
 * for example it could never contain two consecutive 
 * commas such as "1,,3".
 * 
 * Example 1:
 * "9,3,4,#,#,1,#,#,2,#,6,#,#"
 * Return true
 * 
 * Example 2:
 * "1,#"
 * Return false
 * 
 * Example 3:
 * "9,#,#,1"
 * Return false
 */
public class VerifyPreorderSerializationOfABinaryTree {

    public boolean isValidSerialization(String preorder) {
        int numCount = 0;
        int sharpCount = 0;
        int tmpNumCount = 0;
        for (int i = 0; i < preorder.length() - 1; ++i) {
            if (Character.isDigit(preorder.charAt(i))) {
                while (i + 1 < preorder.length() && 
                        Character.isDigit(preorder.charAt(i + 1))) {
                    i++;
                }
                numCount++;
                tmpNumCount++;
            } else if (preorder.charAt(i) == '#') {
                sharpCount++;
                if (--tmpNumCount < 0) {
                    return false;
                }
            } else {
                continue;
            }
        }
        return preorder.charAt(preorder.length() - 1) == '#' && 
            sharpCount == numCount;
    }

    public boolean isValidSerialization(String preorder) {

    }

}
