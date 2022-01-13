
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
class Deletexnodefromend
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
            System.out.println ("Elements of array of size "+n+" of  testcase number  "+t+"is : "  );
            printList ( head );
            Node result = deletexnode(head, x);
            System.out.println ("The resultant linked list is : " );
            printList(result);
            t--;
        }
    }




    public static Node deletexnode(Node head, int k)
    {
        Node n = head;
        int size = 0;
        Node start = head;
        Node begin = head;
        while (n!=null){
            n = n.next;
            size++;
        }
        if (size == 1){
            return null;
        }
        int i = 1;
        int z= size - k;
        if (z == 0){
            start = head.next;
        }
        while (begin!=null){
            if (i ==z ){
                begin.next = begin.next.next;
            }
            i++;
            begin = begin.next;
        }
        return start;

    }
}