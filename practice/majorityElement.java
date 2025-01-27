import java.util.*; 
class majorityElement {
    public static void main(String[] args) {
    Solution sol=new Solution();
    int arr[]={3,2,3};
    sol.majorityElement(arr);
    // System.out.println(res);
    }
}
class Solution {
    public void  majorityElement(int[] nums) {
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
