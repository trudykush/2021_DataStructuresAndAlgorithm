package April2021.LinkedList;

import java.util.Scanner;

public class LinkedListInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases > 0) {
            int n = sc.nextInt();
            Node head = null;
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                Solution ob = new Solution();
                if (indicator == 0) {
                    head = ob.insertAtBeginning(head, value);
                } else {
                    head = ob.insertAtEnd(head, value);
                }
            }
            printList(head);
            numberOfCases--;
        }
    }

    private static void printList(Node node) {
        while(node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    private static class Solution {

        public Node insertAtBeginning(Node head, int value) {
            Node temp = new Node(value);    // Creating Node
            if (head == null) {
                return temp;
            }
            temp.next = head;               // Updating head
            return temp;
        }

        public Node insertAtEnd(Node head, int value) {
            Node temp = new Node(value);
            if (head == null) {
                return temp;
            } else {
                Node ptr = head;
                while (ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = temp;
                temp.next = null;
            }
            return head;
        }
    }
}
