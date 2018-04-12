package solution20;

public class MergeKSortedLists23 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		int amount = lists.length;
		while (amount != 1) {
			for (int i = 0; i < amount / 2; i++) {
				lists[i] = mergeTwoLists(lists[2 * i], lists[2 * i + 1]);
			}
			if (amount % 2 == 1) {
				lists[amount / 2] = lists[amount - 1];
				amount++;
			}
			amount /= 2;
		}
		return lists[0];
	}

	public ListNode mergeKListsTimeOut(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		ListNode reListNode = lists[0];
		for (int i = 1; i < lists.length; i++) {
			reListNode = mergeTwoLists(reListNode, lists[i]);
		}
		return reListNode;
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}
