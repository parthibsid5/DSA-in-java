import java.util.HashMap;
import java.util.Map;

public class majority_element {
    public static void main(String args[]){
        majority_element me=new majority_element();
        int nums[]={2,1,5,5,5,5,6,6,6,6,6};
        int n=nums.length;
        me.bruteforce(nums,n);
        me.majorityElement_HM(nums);
    }
    public static void bruteforce(int arr[],int n){
        java.util.ArrayList <Integer> a=new java.util.ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c>(n/3)){
                if(a.size()==0 || arr[i]!=a.get(0))
                {a.add(arr[i]);}
            }
            if(a.size()==2){
                a.sort(null);
            }

        }
    }
    public void  majorityElement_HM(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null){
                map.put(nums[i],(map.get(nums[i])+1));
            }
            else{
            map.put(nums[i],1);
            }
        }
        System.out.println("hi");
        System.out.println(map);


        for (Map.Entry<Integer, Integer> e :map.entrySet()) {
            if(e.getValue()>((nums.length)/2)){
                System.out.println(e.getKey());
                break;
            }
        }

    }
}
