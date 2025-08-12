import java.util.*;
// public class combinationSum {
    
//     public static void main(String args[]){
//         int arr[]={1,1,1},target=2;
//         List<Integer> comb=new ArrayList<>();
//         List<List<Integer>> result=new ArrayList<>();
//         HashSet<List<Integer>> set =new HashSet<>();
        
//         calculateSum(arr, target,0,comb,result,set);
//         System.out.println(set);

//     }

//     public static void calculateSum(int []arr, int target,int i, List<Integer> comb, List<List<Integer>> result,HashSet<List<Integer>> set){
//         if(i==arr.length || target<0){
//             return;}
//         if(target==0){
//             set.add(new ArrayList<>(comb)); // add as arraylist
//         }
//         comb.add(arr[i]);
//         calculateSum(arr, target-arr[i], i+1, comb,result,set); //single inc
//         calculateSum(arr, target-arr[i], i, comb,result,set); //multiple inc
//         comb.remove(comb.size() - 1);                            //backtracking
//         calculateSum(arr, target, i+1, comb,result,set); //multiple inc
        
//     }
// }
class combinationSum {
    public static void main(String args[]) {
        int arr[]={1,1,1},target=2;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        solve(arr, 0, target, 0, result, comb);
        System.out.println(result);
    }
    public static void solve(int[] arr, int idx, int target, int sum,
                      List<List<Integer>> result, List<Integer> comb) {
        if (sum == target) {
            result.add(new ArrayList<>(comb));
            return;
        }

        if (idx == arr.length) return;

        comb.add(arr[idx]);
        solve(arr, idx + 1, target, sum + arr[idx], result, comb);
        comb.remove(comb.size() - 1); 
        
        solve(arr, idx + 1, target, sum, result, comb);
    }
}
