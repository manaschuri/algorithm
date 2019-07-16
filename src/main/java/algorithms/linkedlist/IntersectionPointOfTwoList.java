package algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class IntersectionPointOfTwoList {

    public static void main(String[] args) {

        //Linked List 1
        Node node6 = new Node(6, null);
        Node node5 = new Node(5, node6);
        Node node4 = new Node(4, node5);
        Node node3 = new Node(3, node4);
        Node node2 = new Node(2, node3);
        Node head1 = new Node(1, node2);

        //Linked List 2
        Node node9 = new Node(5, null);
        Node node8 = new Node(4, node9);
        Node head2 = new Node(3, node8);

        List<Integer> values = new ArrayList();
        while (head1 != null) {
            values.add(head1.getValue());
            head1 = head1.getNext();
        }

        while (head2 != null) {
            if (values.contains(head2.getValue())) {
                break;
            }
            head2 = head2.getNext();
        }

        System.out.println("Intersection Point : " + head2.getValue());
    }
}
