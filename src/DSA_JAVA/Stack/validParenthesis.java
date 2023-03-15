package DSA_JAVA.Stack;

import java.util.Stack;

public class validParenthesis {

    StackReverseString st = new StackReverseString();

    public static void main(String[] args) {
        Stack<Character> check = new Stack();

        String s = "{[(]";

        for (char c : s.toCharArray()){
            if ( c =='(' || c == '{' || c == '['){
                check.push(c);
            }
            else {

                if (check.isEmpty()){
                    System.out.println("False");
                    return;
                }
                else {
                    char top = check.peek();
                    if (c == ')' && top == '(' || c == '}' && top == '{' || c == ']' && top == '['){
                        check.pop();
                    }
                    else {
                        System.out.println("False");
                        return;
                    }
                }

            }
        }

        if (check.isEmpty()){
            System.out.println("True");
        }
    }
}
