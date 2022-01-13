/*Given a linked list and a key, remove all occurrences of the key from the Linked List. Return the head of the resultant list.
Input:
LinkedList = 2->2->1->4->4
x = 4
Output: 
3
2 2 1 
*/

import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}
class Deleteoccurencesofkey
{
    Node head;
    public static void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int sizeofthelinkedlist(Node head)
    {
        int x=0;
        while(head!=null)
        {
            x+=1;
            head=head.next;
        }
        return x;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            int x = sc.nextInt();

            Node result = deleteAllOccurances(head, x);
            System.out.println(sizeofthelinkedlist(result));
            printList(result);
            t--;
        }
    }




    public static Node deleteAllOccurances(Node head, int k)
    {

        if(head.data == k && head.next == null){
            return null;
        }
        while (head.data == k){
            head = head.next;
        }
        Node node = head;
        Node res = head;
        while (node.next!=null) {
            if (node.next.data == k){
                while ( node.next !=null  && node.next.data == k ){
                    node = node.next;
                }
                if (node.next!=null) {
                    res.next = node.next;
                    res = node.next;
                    node = node.next;
                }
                else  if (node.next == null){
                    res.next = null;
                }

            }
            else {
                node = node.next;
                res = node;

            }
        }
        return head;

    }
}
