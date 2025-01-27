// insert/ add O(1)          
//  search /contains O(1)    
// delete /remove O(1)       

// thst is constant time complexity!
import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String args[]){
        // create
        HashSet<Integer> set=new HashSet<>();

        // insert
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(19);
        set.add(12);
        set.add(5);
        System.out.println(set);

        // search -contains : returns boolean
        System.out.println(set.contains(1));
        System.out.println(set.contains(6));


        // remove
        set.remove(1);
        System.out.println(set.contains(1)?"Present":"not present");

        // size
        System.out.println(set.size());

        System.out.println(set);

        // iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
