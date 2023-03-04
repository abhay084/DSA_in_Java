package DSA_JAVA.LL;

public class DuplicateLL {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next =null;
        }
    }

    public void  print_All_Nodes(ListNode head){
        ListNode curr = head;

        while (curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void removeDuplicate(ListNode head){
        ListNode curr = head;

        while (curr != null && curr.next != null){
            if (curr.data == curr.next.data){
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
    }

    public void insertInSorted(int data, ListNode head){

        ListNode curr = head;
        ListNode new_node = new ListNode(data);

        while (curr != null){
            if(curr.data < new_node.data && curr.next.data > new_node.data){
                new_node.next = curr.next;
                curr.next = new_node;
            }
            curr = curr.next;
        }
    }

    public Boolean detectLoop(ListNode head){

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return  true;
            }
        }
        return false;
    }

    public ListNode LoopStarting(ListNode head){
        ListNode temp = head;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return slow;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        DuplicateLL sll = new DuplicateLL();

        sll.head = new ListNode(10);
        ListNode sec = new ListNode(10);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(20);
        ListNode five = new ListNode(30);
        ListNode six = new ListNode(30);
        ListNode seven = new ListNode(30);
        ListNode eight = new ListNode(40);
        ListNode nine = new ListNode(50);
        ListNode ten = new ListNode(50);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = five;
        five.next = six;
        six.next = seven;
        seven.next = eight;
        eight.next = nine;
        nine.next = ten;

//        sll.print_All_Nodes(sll.head);
//        sll.removeDuplicate(sll.head);
//        sll.print_All_Nodes(sll.head);
//        sll.insertInSorted(35,sll.head);
//        sll.print_All_Nodes(sll.head);
//        sll.insertInSorted(22,sll.head);
//        sll.print_All_Nodes(sll.head);

        System.out.println(sll.detectLoop(sll.head));
//        sll.print_All_Nodes(sll.head);
        ListNode temp = sll.LoopStarting(sll.head);
        if(temp != null) {
            System.out.println(temp.data);
        }
        else{
            System.out.println("null");
        }


    }
}
