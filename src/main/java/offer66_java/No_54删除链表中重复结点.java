package offer66_java;

import java.util.HashSet;

/**
 * @author xuyuhan
 * @date 2019-10-28 09:39
 */

public class No_54删除链表中重复结点 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        HashSet<ListNode> listNodes = new HashSet<>();
        while (pHead.next!=null){
            if (!listNodes.add(pHead)){
                return pHead;
            }
        }
        return null;
    }
}
