
// import arraylist to use it
import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        // arraylist takes objects Integer | Float | Boolean
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        // ArrayList<String> strist=new ArrayList<String>();
        // ArrayList<Boolean> boollist=new ArrayList<Boolean>();

        // add elements
        intlist.add(5);
        intlist.add(8);
        intlist.add(3);
        intlist.add(9);
        intlist.add(-15);
        System.out.println(intlist);

        // get these elements
        int ele0 = intlist.get(0);
        System.out.println(ele0);

        // add element in between
        intlist.add(1, 6);
        System.out.println(intlist);

        // set element
        intlist.set(3, 9);
        System.out.println(intlist);

        // remove element
        intlist.remove(3);
        System.out.println(intlist);

        // size of arraylist
        int size = intlist.size();
        System.out.println(size);

        // loop through
        for (int i = 0; i < size; i++) {
            System.out.print(intlist.get(i) + " ");
        }

        // sorting
        Collections.sort(intlist);
        System.out.println("Sorted list : " + intlist);
    }
}
