import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class removeOccofKey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int data = scan.nextInt();
        ListNode temp = new ListNode(data);
        ListNode head = temp;
        ListNode tail = temp;
        for (int i = 1; i < n; i++) {
            data = scan.nextInt();
            temp = new ListNode(data);
            tail.next = temp;
            tail = temp;
        }
        int key = scan.nextInt();
        ListNode res = removeOccurences(head, key);
        print(res);
    }
    public static void print(ListNode res) {
        while (res != null) {
            System.out.print(res.data + "\t");
            res = res.next;
        }
    }
    public static ListNode removeOccurences(ListNode head, int key) {

        if (head.data == key) {
            head = head.next;
        }
        ListNode cur = head;
        while ((cur.next != null) && (cur != null)) {
            if (cur.next.data == key) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        if (cur.data == key) {
            return null;
        }
        return head;
    }
}