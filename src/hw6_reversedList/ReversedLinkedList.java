package hw6_reversedList;

public class ReversedLinkedList {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printList(node1);
        System.out.println();

        ListNode reversedNode = reverse(node1);
        printList(reversedNode);

    }

    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printList(ListNode head) {
        System.out.print("Input: head = ");
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
}
