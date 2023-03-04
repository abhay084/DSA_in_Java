package DSA_JAVA.LL;

public class SinglyLL {

    private ListNode head;

    private static class ListNode {
        private int data; // generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLL sll = new SinglyLL();

        sll.head =  new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(90);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;

    }
}
