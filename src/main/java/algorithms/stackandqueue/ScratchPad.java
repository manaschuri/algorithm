package algorithms.stackandqueue;

public class ScratchPad {

    public static void main(String[] args) {

        //stackUsingQueue();
        queueUsingStack();
    }

    private static void queueUsingStack() {
        QueueUsingStack queue = new QueueUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(5);
        queue.enqueue(6);

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(1);
        queue.enqueue(2);

        queue.dequeue();
    }

    private static void stackUsingQueue() {
        StackUsingQueue stack = new StackUsingQueue();

        //Add elements to stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //Remove elements from stack
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(5);
        stack.push(6);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        stack.push(1);
        stack.push(2);

        stack.pop();
    }
}
