package algorithms.linkedlist;

public class Node {
    private int value;
    private Node next;

    public Node() {
    }

    public Node(final int value, final Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(final int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(final Node next) {
        this.next = next;
    }
}

