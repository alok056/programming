package javademo.core.collections.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        /************************************
         *         Creating a Stack         *
         ************************************/

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stackWithCapacity = new Stack<>();
        stackWithCapacity.ensureCapacity(50);

        /************************************
         *  Inserting into a Stack (push)   *
         ************************************/

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(20);
        System.out.println("stack after push: " + stack);

        /********************************************
         *   Fetching from a Stack (peek)           *
         ********************************************/

        System.out.println("peek(): " + stack.peek());
        System.out.println("search(20): " + stack.search(20));
        System.out.println("contains(30): " + stack.contains(30));

        /********************************************
         *   Removing from a Stack (pop)            *
         ********************************************/

        System.out.println("pop(): " + stack.pop());
        System.out.println("stack after pop: " + stack);
        stack.removeElement(20);
        System.out.println("stack after removeElement(20): " + stack);
        stack.clear();

        /********************************************
         *   Checking if the Stack is empty         *
         ********************************************/

        System.out.println("isEmpty(): " + stack.isEmpty());
        stack.push(1);
        System.out.println("isEmpty() after push: " + stack.isEmpty());

        try {
            stack.clear();
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("pop on empty stack: " + e.getClass().getSimpleName());
        }
    }
}
