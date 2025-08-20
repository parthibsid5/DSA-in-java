public class dailyTemp {
    public static void main(String[] args) {
        Solution sol=new Solution();
        int temp[]={30,60,90};
        sol.dailyTemperatures(temp);
    }
}
class Solution {
    public void dailyTemperatures(int[] temperatures) {
        int x=temperatures.length;
        int result[]=new int[x];
        for(int i=0;i<temperatures.length;i++){
            int k=0;
            for(int j=i+1;j<temperatures.length;j++){
                k++;
                if(temperatures[j]>temperatures[i]){
                    result[i]=k;
                    break;
                }
            }
        }
        for(int i=0;i<x;i++){
            System.out.println(result[i]);
        }
    }
}