package algorithms.stackandqueue;

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int number) {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        stack1.push(number);
        System.out.println("Element pushed to queue : " + number);

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue() {
        if (stack1.isEmpty()) {
            System.out.println("queue is empty.");
            return null;
        }
        System.out.println("Element removed from queue : " + stack1.peek());
        return stack1.pop();
    }
}
