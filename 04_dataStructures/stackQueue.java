// Questions in queue
// an efficient queue has  O(1) to add , remove and peek
import java.util.*;
public class stackQueue {
    static Stack<Integer> s1=new Stack<>();
    static Stack<Integer> s2=new Stack<>();
    public static void main(String args[]){
        stackQueue qq=new stackQueue();
       qq.add(5);
       qq.add(8);
       qq.add(7);
       qq.add(9);
       System.out.println(qq.peek()+" top");
       System.out.println(qq.remove()+" removed");
       System.out.println(qq.remove()+" removed");
       System.out.println(qq.remove()+" removed");
       System.out.println(qq.remove()+" removed");
       System.out.println(qq.remove()+" removed");
    }
    public static boolean isEmpty(){
        return s1.isEmpty();
    }
    public void add(int data){
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return s1.pop();
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue empty! nothing to peek");
            return -1;
        }
        return s1.peek();
    }

}
