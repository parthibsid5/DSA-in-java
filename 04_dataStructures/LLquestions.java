public class LLquestions {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    // have created add first for LL creatiton
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // find the n-th node from last and delete it
    public static void nth_Last(Node head, int n) {
        if (head == null) {
            System.out.println("List is empyty!");
            return;
        }

        // find size
        int size = 0;
        Node currNode = head;
        while (currNode != null) {
            currNode = currNode.next;
            size++;
        }

        // find and delete

        int idx = size - n;
        currNode = head;
        int i = 1;
        while (i < idx) {
            currNode = currNode.next;
            i++;
        }
        currNode.next = currNode.next.next;

        Node newcurrNode = head;
        while (newcurrNode != null) {
            System.out.print(newcurrNode.data + "-->");
            newcurrNode = newcurrNode.next;
        }
        System.out.print("-->null");

    }


    public static void main(String arrs[]) {
        LLquestions list = new LLquestions();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        nth_Last(head, 2);

    }
}
