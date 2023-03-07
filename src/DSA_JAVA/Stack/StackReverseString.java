package DSA_JAVA.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackReverseString {

    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public void Stack(){
        top = null;
        length = 0;
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

    public int peek(){
        return top.data;

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


    public static void main(String[] args) {

        String str = "ABhay";

        Stack <Character>  st =  new Stack<>();

        char [] chr = str.toCharArray();

        for (char i : chr){
            st.push(i);
        }

        for(int i=0;i<str.length();i++){
            chr[i] = st.pop();
        }

        System.out.println(chr);


    }


}
