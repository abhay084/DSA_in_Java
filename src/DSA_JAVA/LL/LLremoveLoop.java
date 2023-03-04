package DSA_JAVA.LL;

public class LLremoveLoop {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public  ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(ListNode head){
        ListNode curr = head;

        while (curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void removeLoop(ListNode slow){
        ListNode temp = head;

        while (slow.next != temp.next){
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
        display(head);
    }
    public void detectLoop(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                removeLoop(slow);
                return;
            }
        }

        return;
    }

    public static void main(String[] args) {

        LLremoveLoop sll = new LLremoveLoop();

        sll.head = new ListNode(1);
        ListNode sec = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = fourth;

        sll.detectLoop(sll.head);

    }
}
