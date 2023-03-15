package DSA_JAVA.Queue;

import java.util.EmptyStackException;

public class QueueInJava {

    private ListNode front;
    private ListNode rear;

    private  int length;

    private class ListNode{
        private  int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    public int length(){
        return  length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void enque(int data){
        ListNode temp = new ListNode(data);

        if (isEmpty()){
            front = temp;

        }
        else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public void print(){
        if (isEmpty()){
            return;
        }
        ListNode curr = front;
        while (curr != null){
            System.out.print(curr.data + " => ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int dequeue(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        int res = front.data;
        front = front.next;

        if (front == null){
            rear = null;
        }
        length--;
        return res;
    }

    public static void main(String[] args) {

        QueueInJava qu = new QueueInJava();
        qu.enque(10);
        qu.print();
        qu.enque(20);
        qu.enque(30);
        qu.enque(50);
        qu.print();
        qu.dequeue();
        qu.dequeue();
        qu.print();
    }
}
