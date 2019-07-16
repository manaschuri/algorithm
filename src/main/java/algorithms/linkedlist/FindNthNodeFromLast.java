package algorithms.linkedlist;

public class FindNthNodeFromLast {

    public static void main(String[] args) {

        int nthElement = 2;
        int count = 0;

        Node slowPointer = createData();
        Node fastPointer = slowPointer;

        while (fastPointer != null && count < nthElement) {
            fastPointer = fastPointer.getNext();
            count ++;
        }

        while (fastPointer.getNext() != null) {
            slowPointer = slowPointer.getNext();
            fastPointer = fastPointer.getNext();
        }

        System.out.println(slowPointer.getValue());
    }

    private static Node createData() {
        Node node9 = new Node(9, null);
        Node node8 = new Node(8, node9);
        Node node7 = new Node(7, node8);
        Node node6 = new Node(6, node7);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        Node head = node1;
        return head;
    }
}
