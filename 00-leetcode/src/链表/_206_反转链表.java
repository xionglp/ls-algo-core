package 链表;

/**
 * https://leetcode.cn/problems/reverse-linked-list/
 * @author xlp
 *
 */
public class _206_反转链表 {
	/**
	 * 递归
	 * @param head
	 * @return
	 */
	public ListNode reverseList1(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		
		ListNode newHead = reverseList1(head.next);
		head.next.next = head;
		head.next = null;
        return newHead;
	}
	
	/**
	 * 迭代
	 * @param head
	 * @return
	 */
	public ListNode reverseList2(ListNode head) {
		if (head == null) return null;
		if (head.next == null) return head;
		
		ListNode newHead = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = newHead;
			newHead = head;
			head = tmp;
		}
        return newHead;
	}
	
	
}
