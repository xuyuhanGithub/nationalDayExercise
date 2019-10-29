package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-27 16:30
 */

public class No_38二叉树深度 {
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        int nLelt=TreeDepth(root.left);
        int nRight=TreeDepth(root.right);

        return nLelt>nRight?(nLelt+1):(nRight+1);
    }
}
