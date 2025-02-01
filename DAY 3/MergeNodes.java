import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class MergeNodes {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode currentNew = dummy;
        ListNode currentOld = head.next;
        int sum = 0;

        while (currentOld != null) {
            if (currentOld.val == 0) {
                if (sum != 0) {
                    currentNew.next = new ListNode(sum);
                    currentNew = currentNew.next;
                    sum = 0;
                }
            } else {
                sum += currentOld.val;
            }
            currentOld = currentOld.next;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        ListNode head = new ListNode(0);
        ListNode current = head;
        
        for (int i = 0; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }
        
        scanner.close();
        
        MergeNodes obj = new MergeNodes();
        ListNode result = obj.mergeNodes(head);
        
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
