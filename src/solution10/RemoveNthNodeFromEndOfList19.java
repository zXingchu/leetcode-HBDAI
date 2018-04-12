package solution10;

public class RemoveNthNodeFromEndOfList19 {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode temp = head;
		for (int i = 0; i < n; i++) {
			temp = temp.next;
			if (temp == null && i < n - 1)
				return null;
		}
		if (temp == null) {
			head = head.next;
		} else {
			ListNode q = head;
			while (temp.next != null) {
				temp = temp.next;
				q = q.next;
			}
			q.next = q.next.next;
		}
		return head;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
