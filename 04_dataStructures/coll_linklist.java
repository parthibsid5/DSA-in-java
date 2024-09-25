// we have seen functionalities of a linkedlist, we can achive the same using inbuilt functions in java

import java.util.*;
public class coll_linklist {
    public static void main(String args[]){
        LinkedList<String> list= new LinkedList<String>();

        list.addFirst("there");
        list.addFirst("Hello");

        list.addLast("is");
        list.addLast("going");
        list.removeFirst();
        list.removeLast();
        list.remove(1);//give index to remove

        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
