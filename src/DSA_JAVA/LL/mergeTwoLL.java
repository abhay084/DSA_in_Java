package DSA_JAVA.LL;

public class mergeTwoLL {

    private  ListNode head;

    private static class ListNode{
        private int data;

        private ListNode next;

        public  ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void  display(ListNode head){
        ListNode curr = head;

        while (curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public ListNode merge(ListNode a, ListNode b){

        ListNode head= null;

        if(a.data < b.data){
            head = a;
            a = a.next;
        }
        else{
            head = b;
            b = b.next;
        }

        ListNode tem = head;

        while (a != null && b != null){
            if(a.data <= b.data){
                head.next = a;
                a = a.next;
            }
            else{
                head.next = b;
                b = b.next;
            }
            head = head.next;
        }

        if (a == null){
            head.next = b;
        }
        else {
            head.next = a;
        }


        return tem;
    }

    public int Length(ListNode head){

        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public void InsertEnd(int val, ListNode head){

        if (head != null){
            ListNode New_data = new ListNode(val);
            head = New_data;
        }
        ListNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        ListNode New_data = new ListNode(val);
        temp.next = New_data;
    }

    public ListNode addTwoLL(ListNode a, ListNode b){

        int l1 = Length(a);
        int l2 = Length(b);

        mergeTwoLL sum1 = new mergeTwoLL();

        if(l1 != l2){
            System.out.println("ERROR : Both linked List should have equal lengths");
            return null;
        }
        else {

            while (a != null && b != null) {
                InsertEnd(a.data + b.data, head);
                a = a.next;
                b = b.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        mergeTwoLL sll1 = new mergeTwoLL();

        sll1.head =  new ListNode(1);
        ListNode sec = new ListNode(3);
        ListNode third = new ListNode(5);

        sll1.head.next = sec;
        sec.next = third;

        mergeTwoLL sll2 = new mergeTwoLL();
        sll2.head = new ListNode(2);
        ListNode thi = new ListNode(3);
        ListNode fourth = new ListNode(4);
//        ListNode five = new ListNode(6);

        sll2.head.next = thi;
        thi.next = fourth;


        sll2.display(sll2.head);
        sll1.display(sll1.head);

//        ListNode res =  sll1.merge(sll1.head,sll2.head);
//        sll1.display(res);

        

    }
}
