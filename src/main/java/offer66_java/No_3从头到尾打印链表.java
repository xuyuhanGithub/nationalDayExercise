package offer66_java;
import java.util.ArrayList;
import java.util.Stack;
/**
 * @author xuyuhan
 * @date 2019-10-21 15:04
 */

class ListNode {
        int val;
        ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }


public class No_3从头到尾打印链表 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack=new Stack<Integer>();

            while(listNode!=null){
                stack.push(listNode.val);
                listNode=listNode.next;
            }

            ArrayList<Integer> list=new ArrayList<Integer>();
            while(!stack.isEmpty()){
                list.add(stack.pop());
            }
            return list;
        }
}
