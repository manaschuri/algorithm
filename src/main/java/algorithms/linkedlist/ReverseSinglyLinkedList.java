package algorithms.linkedlist;

public class ReverseSinglyLinkedList {

    public static void main(String[] args) {
        Node head = createData();
        printLinkedList(head);
        head = reverseLinkedList(head);
        printLinkedList(head);
    }

    private static Node reverseLinkedList(Node node) {
        Node previous = null;
        Node current = node;
        Node next;
        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }

    private static void printLinkedList(final Node head) {
        Node node = head;
        System.out.println("\nPrint Linked List");
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }

    private static Node createData() {
        Node node4 = new Node(4, null);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Node head = node1;
        return head;
    }
}

