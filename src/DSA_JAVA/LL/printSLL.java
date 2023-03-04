package DSA_JAVA.LL;

public class printSLL {

    private ListNode head;

    private static  class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void display(){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void LengthofSLL(){
        if (head == null ){
            System.out.println("0");
            return;
        }
        int count =0;
        ListNode cur = head;
        while(cur != null ){
            count ++;
            cur = cur.next;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        printSLL sll = new printSLL();

        sll.head = new ListNode(10);
        ListNode sec = new ListNode(12);
        ListNode third = new ListNode(13);
        ListNode fourth = new ListNode(14);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;

        sll.display();
        sll.LengthofSLL();


    }
}
