// Given a linked list, reverse it.
// Example:
// Input:  1→2→3→4→NULL
// Output:  4→3→2→1→NULL

import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }

}

public class linkedListReversal {
    static Node tail;
    private static Node head;
    private static Node head2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nodes for list 1");
        int number_of_nodes = scan.nextInt();
        for (int i = 0; i < number_of_nodes; i++) {
            int data = scan.nextInt();
            Node temp = new Node(data);
            insertatEnd(temp);
        }
        System.out.println("List 1 :");
        print(head);
        reversell(head);

    }

    public static void reversell(Node node) {
        Stack<Integer> stack = new Stack<>();
        for (Node temp = node; temp != null; temp = temp.next) {
            stack.push(temp.data);
        }

        while (stack.size() > 0) {
            int data = stack.peek();

            System.out.print(data + "\t");
            stack.pop();

        }


    }

    public static void insertatEnd(Node temp1) {
        if (head == null) {
            head = temp1;
            tail = head;
            temp1.next = null;
        } else {
            tail.next = temp1;
            temp1.next = null;
            tail = temp1;
        }
    }


    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
        System.out.println();
    }


}
