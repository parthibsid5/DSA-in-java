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


    // check if a LL is pallindrome
    public boolean isPallindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node middle=findMiddle(head);
        
        Node secHalfSart= reverseHalf(middle.next);

        Node firstHalfStart=head;
        while(secHalfSart!=null){
            if(firstHalfStart.data!=secHalfSart.data){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secHalfSart=secHalfSart.next;
        }
        return true;
    }

    public Node findMiddle(Node head){
        Node hare=head;
        Node turtle=head;
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;

    }
     
    public Node reverseHalf(Node head){
        // if(head==null){return }
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            // reverse link
            Node nextNode=currNode.next;
            // update
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        // head.next=null;
        // head=prevNode;
        return prevNode;
        // prevNode.next=head;
        
    }



    // check if a loop exists
    public boolean isCycle(Node head) {
        if(head==null){return false;}
        Node turtle = head;
        Node hare = head;
        // System.out.println("true");
        while (hare.next != null && hare != null) {
            turtle = turtle.next;
            hare = hare.next.next; 
            if (turtle==hare) {
                return true;
            }
        }
        return false;
    }
    public static void main(String arrs[]) {
        LLquestions list = new LLquestions();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(3);

        // nth_Last(head, 2);
        // LLquestions obj1=new LLquestions();
        // boolean result=obj1.isPallindrome(head);
        // System.out.println(result);

        boolean result=list.isCycle(head);
        System.out.println(result);
        }
}
