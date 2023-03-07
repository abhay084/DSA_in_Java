package DSA_JAVA.Stack;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class StackLL {

    private  ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private  ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public void Stack(){
        top = null;
        length =0;
    }
    public int Length(){
        return  length;
    }

    public boolean isEmpty(){
        return length==0;

    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        int res = top.data;
        top = top.next;
        length--;
        return res;
    }

    public int peak(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
