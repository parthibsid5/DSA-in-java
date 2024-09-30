import java.util.*;
public class stack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stackClass{
        public static Node head;
        // for arraylist
       static ArrayList<Integer> list =new ArrayList<>();

        public static boolean isEmptyStack(){
            return head==null;
        }
        public static boolean isEmptyArrayList(){
            return list.size()==0;
        }
        // arraylist push
        public static void ALpush(int data){
            list.add(data);
        }
        // arraylist pop
        public static int ALpop(){
            if(isEmptyArrayList()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // arraylist peek
        public static int ALpeek(){
            if(isEmptyArrayList()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
        // LL push
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmptyStack()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        // LL po
        public static int pop(){
            if(isEmptyStack()){
                System.out.println("Empty stack nothing to pop!");
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top; //the popped item

        }
        // LL peek
        public static int peek(){
            if(isEmptyStack()){
                System.out.println("Empty stack nothing to peek");
                return -1;
            }
            int peekElement=head.data;
            return peekElement;
        }
    }
     
    public static void main(String args[]){
        stackClass s=new stackClass();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("stack using LInked List");
        while(!s.isEmptyStack()){
            System.out.println(s.peek());
            s.pop();
        }
        // arraylist stack
        stackClass a =new stackClass();
        a.ALpush(6);
        a.ALpush(2);
        a.ALpush(9);
        a.ALpush(5);
        System.out.println("stack using Array List");
        while(!a.isEmptyArrayList()){
            System.out.println(a.ALpeek());
            a.ALpop();
    }

    }
}
