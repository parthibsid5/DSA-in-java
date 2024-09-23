class linklist {

    Node head;
    private int size;

    linklist(){
        this.size=0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add Last
    public void addLast(String data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // finding last node
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        size--;
        head = head.next;
    }

    // delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        size--;
        // If there is only one element in the list
        if (head.next == null) {
            head = null;
            return;
        }
        Node secLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            secLast = lastNode;
            lastNode = lastNode.next;
        }
        secLast.next = null;
    }

    // print

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            // System.out.print(currNode.next);
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]) {
        linklist list = new linklist();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");

        list.addLast("p");
        list.deleteLast();
        list .deleteFirst();

        list.printList();

        int size=list.getSize();
        System.out.println("size is : "+size);

    }
}
