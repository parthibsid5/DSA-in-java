public class LLdemo {
    Node head;
    private int size;

    LLdemo(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void add(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            size++;
            return;
        }
        head.next=newNode;
        head=newNode;
        size++;
    }
    public void show(){
        Node newnNode=head;
        while(newnNode!=null){
            System.out.print(newnNode.data+"-->");
            newnNode=newnNode.next;
        }
    }
    public static void main(String[] args) {
        LLdemo ll=new LLdemo();
        ll.add(5);
        ll.add(8);
        ll.add(1);

        // System.out.println(ll.size);
        ll.show();
    }
}
