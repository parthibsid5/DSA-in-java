import java.util.*;

// Hashmap has key value pairs, keys are unique!

public class hashmap {
    public static void main(String args[]){
        // key(country) , value(population)
        HashMap <String, Integer> map=new HashMap<>();

        // insert
        map.put("IND", 120);
        map.put("CHN", 150);
        map.put("USA", 50);
        map.put("RUS", 100);

        System.out.println(map);
        map.put("USA",60);//reinsert to update!
        System.out.println(map);

        // search / contains
        System.out.println(map.containsKey("ID")?"present":"not present");

        // get value
        System.out.println(map.get("IND"));
        // null is not present!
        System.out.println(map.get("ID"));

        // iterate

        for(Map.Entry<String, Integer> e :map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys=map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        // delete a pair
        map.remove("CHN"); 
        //china deleted!
        System.out.println(map);

    }
}
