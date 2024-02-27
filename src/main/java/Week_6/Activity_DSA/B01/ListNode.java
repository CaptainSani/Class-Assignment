package Week_6.Activity_DSA.B01;

import org.w3c.dom.Node;

public class ListNode {
    //data is the actual value stored in the node

    Object data;

    Node next;
    Node prev;

    public ListNode(Object data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
