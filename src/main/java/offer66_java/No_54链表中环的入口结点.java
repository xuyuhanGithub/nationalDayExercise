package offer66_java;

import java.util.HashSet;

/**
 * @author xuyuhan
 * @date 2019-10-28 09:34
 */

public class No_54链表中环的入口结点 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> set = new HashSet<ListNode>();

        while (pHead.next != null) {

            if (!set.add(pHead)) {

                return pHead;

            }
        }

        return null;
    }

}
