package solution20;

public class ReverseNodesInKGroup25 {


	public ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || k == 1)
			return head;
		ListNode p = head;
		ListNode tail = head;
		for (int i = 1; i < k; i++) {
			if (head.next == null)
				return p;
			head = head.next;
		}

		ListNode q = p.next;
		ListNode r = q.next;
		for (int i = 1; i < k; i++) {
			q.next = p;
			p = q;
			q = r;
			if (r != null)
				r = r.next;
		}
		tail.next = reverseKGroup(q, k);
		return head;
	}

}
