package offer66_java;
import java.util.Stack;
/**
 * @author xuyuhan
 * @date 2019-10-21 16:22
 */

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class No_14链表中第K个 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k ==0 ){
            return null;
        }

        //可以先把链表反转，然后找出第k个
        Stack<ListNode> stack = new Stack<ListNode>();
        int count = 0;
        while(head != null){
            stack.push(head);
            head = head.next;
            count++;
        }

        if(count < k){
            return null;
        }

        ListNode knode = null;
        for(int i = 0; i < k; i++){
            knode = stack.pop();
        }


        return knode;
    }
}
