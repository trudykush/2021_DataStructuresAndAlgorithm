package April2021.LinkedList;

public class DeleteNodeWithoutHeadPointer {
    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
