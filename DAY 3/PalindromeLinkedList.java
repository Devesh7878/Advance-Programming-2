import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = mid(head);
        ListNode h = reverse(s);
        ListNode rereverse = h;

        while (f != null && h != null) {
            if (f.val != h.val) {
                break;
            }
            h = h.next;
            f = f.next;
        }

        reverse(rereverse);
        return f == null || h == null;
    }

    public ListNode mid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;
        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;
        
        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }
        
        scanner.close();
        
        PalindromeLinkedList obj = new PalindromeLinkedList();
        System.out.println(obj.isPalindrome(head) ? "Palindrome" : "Not a Palindrome");
    }
}
