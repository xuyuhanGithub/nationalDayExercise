package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 15:17
 */

/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
public class No_16数的子结构 {
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            return;

        TreeNode pTemp = root.left;
        root.left = root.right;
        root.right = pTemp;

        if(root.left != null)
            Mirror(root.left);
        if(root.right != null)
            Mirror(root.right);
    }
}
