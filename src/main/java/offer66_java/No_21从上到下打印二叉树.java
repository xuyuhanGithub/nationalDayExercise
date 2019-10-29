package offer66_java;

import java.util.ArrayList;

/**
 * @author xuyuhan
 * @date 2019-10-22 16:01
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
public class No_21从上到下打印二叉树 {
    /**
     思路是用arraylist模拟一个队列来存储相应的TreeNode
     */
        public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<TreeNode> queue = new ArrayList<>();
            if (root == null) {
                return list;
            }
            queue.add(root);
            while (queue.size() != 0) {
                TreeNode temp = queue.remove(0);
                if (temp.left != null){
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                list.add(temp.val);
            }
            return list;
        }

}
