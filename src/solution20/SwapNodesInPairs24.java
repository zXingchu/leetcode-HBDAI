package solution20;

public class SwapNodesInPairs24 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode swapPairs(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode p = head;
		head = head.next;
		ListNode q = p.next;
		ListNode temp = null;
		while (q != null) {
			if (temp != null)
				temp.next = q;
			p.next = q.next;
			q.next = p;

			temp = p;
			p = p.next;
			if (p == null || p.next == null)
				break;
			q = p.next;
		}

		return head;
	}

	public ListNode swapPairsRecursion(ListNode head) {
		if ((head == null) || (head.next == null))
			return head;
		ListNode n = head.next;
		head.next = swapPairsRecursion(head.next.next);
		n.next = head;
		return n;
	}

	
	
}
