package June2021.Stack;

import sun.plugin2.applet.StopListener;

public class MinimumElementInStack {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(3);
        s.push(5);
        s.getMin();
        s.push(2);
        s.push(1);
        s.getMin();
        s.pop();
        s.getMin();
        s.pop();
        s.peek();
    }

    private static class MyStack {

        public void push(int x) {

        }

        public void getMin() {

        }

        public void pop() {

        }

        public void peek() {

        }
    }

    // Implementing Stack from scratch
    private static class MyStackUsingLinkedList {

        // A linked list node
        private class Node {
            int data;
            Node next;
        }

        Node top;

        MyStackUsingLinkedList() {
            this.top = null;
        }

        // to add element in the stack
        public void push(int a) {
            // create a new node temp and allocate memory
            Node temp = new Node();

            // check if stack(heap) is full
            // then inserting an element would lead to stack overflow
            if (temp == null) {
                System.out.println("Heap overflow");
                return;
            }
            // initialize data into temp data field
            temp.data = a;
            // put top ref into temp link
            temp.next = top;
            // update top ref
            top = temp;
        }




    }
}
