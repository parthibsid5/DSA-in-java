class revlist {

    Node head;
    private int size;
    revlist(){
        this.size=0;
    }

    // node creation
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;

        }
    }

    // add first element 
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head = newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode; 
        size++;
    }

    // print function of the list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // dynamic size counting;
    public int getSize(){
        return size;
    }

    // reverse using iterative approach
    void reverseIterate() {
        Node prevNode = head;
        Node currNode = head.next;
        if (head == null || head.next == null) {
            return;
        }
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            // update
            prevNode = currNode;
            currNode = nextNode;

        }
        head.next = null;
        head = prevNode;

    }
    // main function
    public static void main(String args[]) {
        revlist list = new revlist();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        
        list.printList();
        
        // list.reverseIterate();
        // list.printList();
        list.head=list.reverseRecursive(list.head);
        list.printList();


    }

    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
