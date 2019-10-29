package offer66_java;

import java.util.Stack;

/**
 * @author xuyuhan
 * @date 2019-10-28 10:44
 */

public class No_60二叉搜索树的第K个节点 {
    TreeNode KthNode(TreeNode root, int k){
        if(root==null||k==0)
            return null;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int count = 0;
        TreeNode node = root;
        do{
            if(node!=null){
                stack.push(node);
                node = node.left;
            }else{
                node = stack.pop();
                count++;
                if(count==k)
                    return node;
                node = node.right;
            }
        }while(node!=null||!stack.isEmpty());
        return null;
    }

}
