package offer66_java;

/**
 * @author xuyuhan
 * @date 2019-10-22 16:11
 */

public class No_25二叉搜索树_中序遍历 {
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
//直接用中序遍历
        TreeNode head = null;
        TreeNode realHead = null;
        public TreeNode Convert(TreeNode pRootOfTree) {
            ConvertSub(pRootOfTree);
            return realHead;
        }

        private void ConvertSub(TreeNode pRootOfTree) {
            if(pRootOfTree==null) return;
            ConvertSub(pRootOfTree.left);
            if (head == null) {
                head = pRootOfTree;
                realHead = pRootOfTree;
            } else {
                head.right = pRootOfTree;
                pRootOfTree.left = head;
                head = pRootOfTree;
            }
            ConvertSub(pRootOfTree.right);
        }

}
