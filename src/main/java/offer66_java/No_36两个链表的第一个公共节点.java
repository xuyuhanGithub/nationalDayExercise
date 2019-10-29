package offer66_java;

import java.util.HashSet;

/**
 * @author xuyuhan
 * @date 2019-10-27 15:59
 */

public class No_36两个链表的第一个公共节点 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;
        HashSet<ListNode> hashSet = new HashSet<ListNode>();
        while (current1 != null) {
            hashSet.add(current1);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (hashSet.contains(current2))
                return current2;
            current2 = current2.next;
        }
        return null;
    }
}
