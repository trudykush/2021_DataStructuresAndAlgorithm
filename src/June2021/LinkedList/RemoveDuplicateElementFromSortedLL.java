package June2021.LinkedList;

import java.util.Scanner;

public class RemoveDuplicateElementFromSortedLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCases = sc.nextInt();
        while (numberOfCases-- > 0) {
            int n = sc.nextInt();
            Node head = null;
        }
    }

    private static class Node {
        int data;
        Node next;
        Node(int x) {
            data = x;
            next = null;
        }
    }
}
