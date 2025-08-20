import java.util.*;
class symmetricPair {
    public static void main(String args[]){
        int arr[][]={{5,8},{7,9},{8,5},{9,7},{6,10}};
        HashMap<Integer,Integer> map=new HashMap<>();
        // ArrayList<Integer,Integer> result =new ArrayList<>();
        for(int pair[] : arr){
            if(map.containsKey(pair[0]) && map.get(pair[0]).equals(pair[1])){
                System.out.println("["+pair[1]+","+pair[0]+"]");
            }
            map.put(pair[1],pair[0]);
        }
        System.out.println(map);
    }
}
