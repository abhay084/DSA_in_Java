package DSA_JAVA.LL;

public class SearchInLL {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }

    public int FindVal(int val){
        ListNode curr = head;
        int count =1;
        if(curr.data == val){
            return count;
        }

        while (curr.next != null){
            if(curr.data == val){
                return count;
            }
            curr = curr.next;
            count++;
        }
        if(curr.data == val){
            return count;
        }
        return -1;
    }

    public ListNode ReverseLL(ListNode head){

        ListNode curr = head;

        ListNode pre = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }

    public  void display(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.print(curr.data + " ==> ");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    //int[] arr = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        SearchInLL sll = new SearchInLL();

        sll.head = new ListNode(10);
        ListNode sec = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);
        ListNode six = new ListNode(60);

        sll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;

        System.out.println(sll.FindVal(60));
        ListNode rhead = sll.ReverseLL(sll.head);
        sll.display(rhead);



    }



}
