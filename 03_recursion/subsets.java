/* Print all the subsets of a set of first 'n' natural numbers
 n=3
 so [null, 1, 2, 3, 12, 13, 23, 123]
*/
import java.util.ArrayList;

public class subsets {
    public static void main(String args[]){
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        find_subsets(n, subset);
    }
    // public static void print_subset(ArrayList<Integer> subset){
    //     for(int i=0;i< subset.size();i++){
    //         System.out.print(subset.get(i));
    //     }
    //     System.out.println();
    // }

    public static void find_subsets(int n, ArrayList<Integer> subset){
        if(n==0){
            System.out.println(subset);
            //         OR
            //  print_subset(subset);
             
            return;
        }
        //  to get added
        subset.add(n);
        find_subsets(n-1, subset);
        
        // to not get added
        subset.remove(subset.size()-1);
        find_subsets(n-1, subset);
    }
        
}
