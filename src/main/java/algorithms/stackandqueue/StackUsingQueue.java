package algorithms.stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    Integer size = 0;

    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int number) {
        queue2.add(number);
        System.out.println("Element pushed to stack : " + number);
        size++;
        while (!queue1.isEmpty()) {
            queue2.add(queue1.peek());
            queue1.remove();
        }

        Queue<Integer> queue = queue1;
        queue1 = queue2;
        queue2 = queue;
    }

    public Integer pop() {
        if (queue1.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        else {
            System.out.println("Element removed from stack : " + queue1.peek());
            return queue1.remove();
        }
    }
}


