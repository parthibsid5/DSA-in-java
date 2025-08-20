import java.util.ArrayList;

public class minStack {
    public static void main(String[] args) {
        MinStack min=new MinStack();
        min.push(-2);
        min.push(0);
        min.push(-3);
        min.getMin();
        min.pop();
        min.top();
        min.getMin();
    }
}

class MinStack {
    ArrayList<Integer> stack;
    static int min=0;
    
    public MinStack() {
        stack=new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
        min=Math.min(min, val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}

