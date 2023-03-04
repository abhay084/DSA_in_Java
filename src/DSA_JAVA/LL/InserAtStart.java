package DSA_JAVA.LL;

public class InserAtStart {

    private  ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void printLL(){
        ListNode curr = head;

        while(curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.print(" null");
        System.out.println();
    }

    public  int length_count(){
        ListNode curr = head;
        if (head == null){
            return  0;
        }
        int count=0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return  count;
    }

    public void insertAtStart(int data){

        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
        printLL();
        System.out.println(length_count());
    }

    public static void main(String[] args) {

        InserAtStart sll = new InserAtStart();
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        sll.printLL();
        System.out.println("Length of LL is : " + sll.length_count());
        sll.insertAtStart(50);
        sll.insertAtStart(60);


    }

}
