package DSA_JAVA.LL;

public class AddTwoLL {

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

    public void  addToEnd(ListNode head, int val){
        ListNode curr = head;

        while (curr.next != null){
            curr = curr.next;
        }

        ListNode temp = new ListNode(val);
        curr.next = temp;
    }

    public ListNode Add(ListNode a, ListNode b){
        ListNode temp = new ListNode(a.data + b.data);
        ListNode head_curr = temp;

        a = a.next;
        b = b.next;

        while (a != null && b != null){
            addToEnd(head_curr,a.data + b.data);
            a = a.next;
            b = b.next;
        }

        return  head_curr;


    }

    public static void main(String[] args) {

        AddTwoLL sll = new AddTwoLL();
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(20);
        ListNode third = new ListNode(30);

        sll.head.next = sec;
        sec.next = third;

        AddTwoLL sll2 = new AddTwoLL();
        sll2.head = new ListNode(10);
        ListNode sec1 = new ListNode(20);
        ListNode third1 = new ListNode(30);

        sll2.head.next = sec1;
        sec1.next = third1;

        sll.display(sll.head);
        sll2.display(sll2.head);

        ListNode new_add  = sll.Add(sll.head,sll2.head);
        sll.display(new_add);

    }
}
