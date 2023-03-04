package DSA_JAVA.LL;

public class InsertAtEnd {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void printLL(){
        InsertAtEnd.ListNode curr = head;

        while(curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.print(" null");
        System.out.println();
    }

    public  int length_count(){
        InsertAtEnd.ListNode curr = head;
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

    public void addAtEnd(int data){
        ListNode curr = head;
        ListNode new_node = new ListNode(data);
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = new_node;
        printLL();
        System.out.println(length_count());

    }

    public void insert(int pos, int val){

        ListNode node = new ListNode(val);

        if(pos == 1){
            node.next = head;
            head = node;
        }
        else {
            ListNode pre = head;
            int count =1;


            while(count < pos -1 ){
                pre = pre.next;
                count++;
            }
            ListNode curr = pre.next;
            pre.next = node;
            node.next = curr;
        }
    }

    public ListNode deleteFirst(){
        if(head == null ){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return  temp;
    }

    public ListNode deleteEnd(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;
        return temp;

    }


    public  void deletePos(int pos){
        if(head == null || head.next == null){
            return;
        }

        if(pos == 1){
            head = head.next;
        }
        else{
            int count =1;
            ListNode curr = head;
            while(count < pos -1){
                curr = curr.next;
                count++;
            }
            curr.next = curr.next.next;
        }


    }


    public static void main(String[] args) {
        InsertAtEnd sll = new InsertAtEnd();
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        sll.printLL();
        System.out.println("Length of LL is : " + sll.length_count());
        sll.addAtEnd(60);
        sll.addAtEnd(70);


        sll.insert(3,1000);
        sll.printLL();
        sll.insert(1,2000);
        sll.printLL();
        sll.insert(8,3000);
        sll.printLL();

        sll.deleteFirst();
        sll.printLL();
        sll.deleteEnd();
        sll.printLL();
        sll.deleteEnd();
        sll.printLL();

        sll.deletePos(3);
        sll.printLL();


    }
}
