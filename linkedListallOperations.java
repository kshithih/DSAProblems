/* All operations of Linked List are shown here.
Input:
addFirst
10
addLast
20
addLast
30
addLast
56
display
10 20 30 56
removeFirst
display
20 30 56
removeLast
display
20 30
getIndex
20
1
*/

import java.io.*;
import java.util.*;

public class linkedList {
    public static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }
    static int size = 0;
    public static void addLast(int val, Node node) {
        Node temp = new Node(val);
        temp.next = null;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = temp;
            tail = temp;

        }
        size++;
    }
    public static void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
            tail = node;
        }
        size++;
    }
    public static void display(Node node) {
        while (node != null) {
            System.out.print(node.data + "\t");
            node = node.next;
        }

    }
    public static int size(Node node) {
        return size;
    }
    public static int getIndex(int data) {
        int i = 2;
        Node node = head;
        while (node.next != null) {
            if (node.next.data == data) {
                return i;
            }
            node = node.next;
            i++;
        }
        return 1;
    }
    public static Integer getLast(Node node) {
        if (node.next == null) {
            node = null;
            return null;
        } else {
            while (node.next != null) {
                node = node.next;
            }
        }
        return node.data;
    }
    public static int getFirst(Node head) {
        return head.data;
    }
    public static void removeFirst(Node node) {
        if (node.next == null) {
            head = head.next;
        } else {
            head = node.next;
            node = null;
        }
        size--;
    }
    public static void removeLast(Node node) {
        if (node.next == null) {
            head = head.next;
        } else {
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
        }
        size--;
    }
    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String stri = input.readLine();

        while (!(stri.startsWith("quit"))) {
            Scanner scan = new Scanner(System.in);
            if (stri.startsWith("addLast")) {
                int val = scan.nextInt();
                Node node = new Node(val);
                addLast(val, node);
            } else if (stri.startsWith("addFirst")) {
                int data = scan.nextInt();
                addFirst(data);
            } else if (stri.startsWith("removeFirst")) {
                removeFirst(head);
            } else if (stri.startsWith("removeLast")) {
                removeLast(head);
            } else if (stri.startsWith("size")) {
                System.out.println(size(head));
            } else if (stri.startsWith("display")) {
                display(head);
            } else if (stri.startsWith("getIndex")) {
                int index = scan.nextInt();
                System.out.println(getIndex(index));
            } else if (stri.startsWith("getFirst")) {
                System.out.println(getFirst(head));
            } else if (stri.startsWith("getLast")) {
                System.out.println(getLast(head));
            }
            stri = input.readLine();
        }
    }
}
