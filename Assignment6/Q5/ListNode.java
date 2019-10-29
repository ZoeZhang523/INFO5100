package Q5;

public class ListNode {
    ListNode next, prev;
    int key;
    int value;

    public ListNode(int key, int value) {
        next = prev = null;
        this.key = key;
        this.value = value;
    }
}
