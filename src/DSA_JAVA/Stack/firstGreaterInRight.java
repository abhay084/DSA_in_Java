package DSA_JAVA.Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class firstGreaterInRight {

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
        top=null;
        length=0;
    }

    public boolean isEmpty(){
        return length == 0;
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

        Stack st = new Stack();

        int[] arr = {4,7,3,4,8,1};

        int l = arr.length;
        int[] res = new int [l];
        for(int i=l-1;i>=0;i--){
            if (!st.isEmpty()){
                while (!st.isEmpty() && (int)st.peek() <= arr[i]){
                    st.pop();
                }
            }
            if (st.isEmpty()){
                res[i] = -1;
            }
            else {
                res[i] = (int)st.peek();
            }
            st.push(arr[i]);
        }

        for (int i=0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

}
