// Given a Linked List, an integer k and an element, add that element at the kth position of the linked list.
// List: 1→3→4→7
// k: 2
// Element: 5
// Result: 1→5→3→4→7

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }

}

public class addatkposition{
    static Node tail;
    private static Node head;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of nodes");
        int number_of_nodes = scan.nextInt();
        for (int i = 0; i < number_of_nodes; i++) {
            int data = scan.nextInt();
            Node temp = new Node(data);
            insertatEnd(temp);

        }
        System.out.println("Enter position i.e. k");
        int k = scan.nextInt();
        int data = scan.nextInt();
        head = insert(head, data, k);
        print(head);
    }

    public static void insertatEnd(Node temp) {
        if (head == null) {
            head = temp;
            tail = head;
            temp.next = null;
        } else {
            tail.next = temp;
            temp.next = null;
            tail = temp;
        }
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }
    }

    public static Node insert(Node head, int data, int k) {
        int i = 1;
        Node node = head;
        Node temp = new Node(data);
        if (k == 1) {
            temp.next = head;
            head = temp;
        } else {
            while ((i + 1) < k) {
                i++;
                node = node.next;
            }

            temp.next = node.next;
            node.next = temp;
        }
        return head;
    }


}
