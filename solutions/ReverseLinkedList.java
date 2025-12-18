
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
//        if(head == null){
//            return null;
//        }
//
//        ListNode newHead = head;
//        if(head.next != null) {
//            newHead = reverseList(head.next);
//                head.next.next = head;
//        }
//        head.next = null;
//
//        return newHead;
//    }
//}
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
