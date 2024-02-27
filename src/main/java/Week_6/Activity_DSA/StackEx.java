package Week_6.Activity_DSA;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //lets check if the stack is empty or not

        boolean isEmptyOrNot = stack.isEmpty();

        System.out.println("is the stack empty ?"+ " "+ isEmptyOrNot);

        //Pushing(add) elements into the stack

        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);

        System.out.println("elements pushed into stack :"+ stack);

        //To remove use .pop(); It removes from the top.
        //stack.pop();
        //stack.pop();

        int peek = stack.peek();

        System.out.println("elements pushed into stack :"+ peek);


    }
}
