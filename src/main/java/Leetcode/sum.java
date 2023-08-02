package Leetcode;
class ListNode{
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}



public class sum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = null;
        ListNode resultHead = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum %= 10;

            ListNode newNode = new ListNode(sum);
            if (current == null) {
                current = newNode;
                resultHead = current;
            } else {
                current.next = newNode;
                current = current.next;
            }
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return resultHead;
    }
    public static void main(String[] args) {
        // Example 1:
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        // Output: 7 -> 0 -> 8 (which is 342 + 465 = 807)
        sum addTwoNumbers = new sum();
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
        printLinkedList(result);
    }
    private static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
        }

    }


}
