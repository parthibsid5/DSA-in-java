import java.util.*;
public class baseball {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String operations[]={"1","C"};
        System.out.println(sol.calPoints(operations));
    }
}
class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list=new ArrayList<>();
        int l=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i]=="C"){
                list.remove(l-1);
                l--;
            }
            else if(operations[i]=="D"){
                list.add(list.get(l-1) * 2);
                l++;
            }
            else if(operations[i]=="+"){
                list.add((list.get(l-2)) + (list.get(l-1)));
                l++;
            }
            else{
                list.add(Integer.valueOf(operations[i]));
                l++;
            }
        }
        int sum=0;
        for(int i=0;i<l;i++){
            sum+=list.get(i);
        }
        return sum;
    }
}
