package algorithms.linkedlist;

/*
Given a linked list, reverse alternate nodes and append at the end

Input:
1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7

Output:
1 -> 3 -> 5 -> 7 -> 6 -> 4 -> 2
*/

public class ReverseEvenNodesAndAppendToTheEnd {

    public static void main(String[] args) {

        Node node7 = new Node(7, null);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head = new Node(1, node2);

        printLinkedList(head);

        Integer counter = 1;
        Integer length = 0;
        Node start = head;

        Node tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
            length ++;
        }

        Node previous = null;
        while (counter <= length) {
            if (counter % 2 == 0) {
                previous.setNext(head.getNext());
                Node temp = head;
                head = head.getNext();

                if (tail.getNext() == null) {
                    temp.setNext(null);
                } else {
                    temp.setNext(tail.getNext());
                }
                tail.setNext(temp);

            } else {
               previous = head;
               head = head.getNext();
            }
            counter++;
        }

        printLinkedList(start);
    }

    private static void printLinkedList(Node node) {
        System.out.println("\n");
        while (node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }
}
