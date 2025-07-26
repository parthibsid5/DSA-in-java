import java.util.*;
public class heapcreate {
    private ArrayList<Integer> list;
    public heapcreate(){
        list=new ArrayList<>();
    }

    private void swap(int first, int second){
        int temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second, temp);
    }
    // to find the parend node index of a children node
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return (index*2)+1;
    }
    private int right(int index){
        return (index*2)+2;
    }

    public void insert(int value){
        list.add(value);
        upheap(list.size()-1);
    }

    private void upheap(int index){
        if(index==0){
            return;
        }
        int p=parent(index);
        if(list.get(index)<list.get(p)){
            swap(index, p);
            upheap(p);
        }
    }
    // default remove the item at 0th index and then re-arrange the tree
    public void remove(int index){
        if(list.size()==0){
            System.out.println("Cannnot remove from empty heap!");
        }
        int rem=list.get(0);
        downheap(0);
    }
    private void downheap(int index){
        
    }

}
