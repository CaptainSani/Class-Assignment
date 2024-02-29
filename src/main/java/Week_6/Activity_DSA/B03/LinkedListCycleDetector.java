package Week_6.Activity_DSA.B03;

public class LinkedListCycleDetector {

    public static boolean hasCycle(DetectCycle.ListNode head){

        if(head == null || head.next == null){
            return false;  //no cycle is it is empty or has only one node
        }

        DetectCycle.ListNode slow = head;
        DetectCycle.ListNode fast = head.next;  //move fast pointer one step ahead


        //Iterate until fast pointer reaches end of the list
        //or slow pointer meets fast pointer (this means a cycle has been detected).
        while (fast != null && fast.next != null) {
            if(slow == fast){
                return true;  //Cycle detected at this point, so it stops looping
            }

            slow = slow.next; //move slow pointer by one step
            fast = fast.next.next;  //move fast pointer by two steps

        }

    return false;  //no cycle found.
    }

    public static void main(String[] args) {

        DetectCycle.ListNode head = new DetectCycle.ListNode(1);
        head.next = new DetectCycle.ListNode(2);
        head.next.next = new DetectCycle.ListNode(3);
        head.next.next.next = new DetectCycle.ListNode(4);
        head.next.next.next.next = head.next;
        head.next =null;


        System.out.println("does the LinkedList contain a cycle? "+ " "+hasCycle(head));

    }

}
