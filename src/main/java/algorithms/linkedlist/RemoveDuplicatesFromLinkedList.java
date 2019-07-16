package algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromLinkedList {

    public static void main(String[] args) {
        Node head = createData();
        printLinkedList(head);
        removeDuplicate(head);
        printLinkedList(head);
    }

    private static void removeDuplicate(Node node) {
        List<Integer> availableValues = new ArrayList();
        Node previous = null;
        Node current = node;
        while (current != null) {
            int data = current.getValue();
            if (availableValues.contains(data)) {
                previous.setNext(current.getNext());
            } else {
                availableValues.add(data);
                previous = current;
            }
            current = current.getNext();
        }
    }

    private static Node createData() {
        Node node6 = new Node(4, null);
        Node node5 = new Node(4, node6);
        Node node4 = new Node(2, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Node head = node1;
        return head;
    }

    private static void printLinkedList(final Node head) {
        Node node = head;
        System.out.println("\nPrint Linked List");
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }
}
