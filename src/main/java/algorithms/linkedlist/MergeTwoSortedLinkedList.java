package algorithms.linkedlist;

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {

        //Linked List 1
        Node node5 = new Node(20, null);
        Node node4 = new Node(15, node5);
        Node node3 = new Node(8, node4);
        Node node2 = new Node(5, node3);
        Node head1 = new Node(1, node2);

        //Linked List 2
        Node node8 = new Node(17, null);
        Node node7 = new Node(11, node8);
        Node head6 = new Node(4, node7);

        Node head = mergeLists(head1, head6);
        printLinkedList(head);
    }

    private static Node mergeLists(Node head1, Node head2) {
        Node dummyNode;
        Node head = new Node();
        dummyNode = head;

        while (true) {
            if (head1 == null) {
                head.setNext(head2);
                break;
            }

            if (head2 == null) {
                head.setNext(head1);
                break;
            }

            if (head1.getValue() < head2.getValue()) {
                head.setNext(head1);
                head1 = head1.getNext();
            } else {
                head.setNext(head2);
                head2 = head2.getNext();
            }
            head = head.getNext();
        }

        return dummyNode.getNext();
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
