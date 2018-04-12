package solution20;

import org.junit.jupiter.api.Test;

class ReverseNodesInKGroup25Test {

	@Test
	void testReverseKGroup() {
		ListNode head = new ListNode(1);
		ListNode ln2 = new ListNode(2);
		ListNode ln3 = new ListNode(3);
		ListNode ln4 = new ListNode(4);
		ListNode ln5 = new ListNode(5);
		head.next = ln2;
		ln2.next = ln3;
		ln3.next = ln4;
		ln4.next = ln5;
		ReverseNodesInKGroup25 r = new ReverseNodesInKGroup25();

		r.reverseKGroup(head, 2);

	}

	@Test
	void testDivide() {
		DivideTwoIntegers29 d = new DivideTwoIntegers29();

		System.out.println(d.divide(1, 1));

	}

}
