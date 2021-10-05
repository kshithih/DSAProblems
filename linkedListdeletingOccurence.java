//Given a linked list and a key, remove all occurrences of the key from the Linked List. Return the head of the resultant list.
//Example
//Linked List: 1→2→3→2→4→7→2
//Key: 2
//After removal: 1→3→4→7

import java.util.ArrayList;
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

    public class linkedListdeletingOccurence {
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
            System.out.println("List is as follows");
            print(head);
            System.out.println("Enter key value to be deleted");
            int key = scan.nextInt();
            removeOccurences(head,key);

        }
      public static  void  removeOccurences(Node head, int key) {
           Node node = head;
           if(node == null){
               node = node.next;
           }
           else {
               while (node.next != null) {
                   if ((node.next.data) == key) {
                       node.next = node.next.next;
                   } else {
                       node = node.next;
                   }
               }
               while (head != null) {
                   System.out.print(head.data + "" + "\t");
                   head = head.next;
               }
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





