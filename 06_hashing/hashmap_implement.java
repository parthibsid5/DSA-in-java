import java.util.*;

import org.w3c.dom.Node;
public class hashmap_implement {

    public class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; //node count
        private int N; //bucket array length
        private LinkedList <Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
    }
    public int searchInLL(K key, int bi){
        LinkedList<Node> ll=bucket[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).ket==key){
                return i;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash(){
        LinkedList<Node> oldbucket[]=buckets;
        buckets=new LinkedList[N*2];

        for(int i=0;i<N*2;i++){
            buckets[i]=new LinkedList<>();
        }

        for(int i=0;i<oldbucket.length;i++){
            LinkedList<Node> ll=oldbucket[i];
            for(int j=0;j<ll.size();j++){
                Node node=ll.get(j);
                put(node.key,node.value());
            }
        }
    }

    public void put(K key,V value){
        int bi=hashFunction(key);
        int di=searchInLL(key,bi);
        if(di==-1){
            buckets[bi].add(new Node(key,value));
            n++;
        }
        else{
            Node node=buckets[bi].get(di);
            node.value=value;
        }
        double l= double(n/N);
        if(l>2.0){
            rehash();
        }
    }



    public static void main(String args[]){
        
    }
}
