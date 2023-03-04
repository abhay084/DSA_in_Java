package DSA_JAVA.LL;

public class DoublyLL {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }


    public DoublyLL(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int getLength(){
        return length;
    }

    public void insertlast(int val){
        ListNode newNode = new ListNode(val);
        if(isEmpty()){
            head =newNode;
        }
        else {
            tail.next = newNode;
        }

        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void displayForword(){
        ListNode temp = head;

        while (temp != null){
            System.out.print(temp.data + " ==> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        ListNode temp = tail;

        while (temp != null){
            System.out.print(temp.data + " ==> ");
            temp =temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.insertlast(10);
        dll.insertlast(20);
        dll.insertlast(30);
        dll.insertlast(40);

        dll.displayForword();
        dll.displayBackward();

    }
}

