package Collections;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Kate");
        stack.push("Dan");
        stack.push("Misha");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
