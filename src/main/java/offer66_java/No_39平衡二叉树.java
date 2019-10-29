package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 16:41
 */

public class No_39平衡二叉树 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;

        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1)
            return false;


        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);

    }

    public int getHeight(TreeNode root) {
        if (root == null)
            return 0;
        return max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
