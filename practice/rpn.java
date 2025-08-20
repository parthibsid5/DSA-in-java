// REVERSE POLISH NOTATION  
import java.util.*;
class rpn {
    public static void main(String[] args) {   
        Solution sol=new Solution();
        String tokens[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.print(sol.evalRPN(tokens));
    }
}
class Solution {
    ArrayList<Integer> stack=new ArrayList<>();
    public int evalRPN(String[] tokens) {
        int l=tokens.length;
        for(int i=0;i<l;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                int temp=0;
                if(tokens[i].equals("+")){
                    temp=stack.get(stack.size()-2) + stack.get(stack.size()-1);
                }
                if(tokens[i].equals("-")){
                    temp=stack.get(stack.size()-2) - stack.get(stack.size()-1);
                }
                if(tokens[i].equals("*")){
                    temp=stack.get(stack.size()-2) * stack.get(stack.size()-1);
                }
                if(tokens[i].equals("/")){
                    temp=stack.get(stack.size()-2) / stack.get(stack.size()-1);
                }
                stack.remove(stack.size()-1);
                stack.remove(stack.size()-1);
                stack.add(temp);

            }
            else{
            stack.add(Integer.parseInt(tokens[i]));
            }
        }
        return stack.get(0);


    }
}
