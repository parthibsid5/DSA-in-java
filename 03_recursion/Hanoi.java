// Time complxity is O(2^n)

public class Hanoi {
    public static void hanoi(int n, String src, String helper, String dest){

        if(n==1){
            System.out.println("disk "+n+" transfered from "+src +" to "+dest);
            // hanoi(1, dest, helper, src);
            return;
        }
        hanoi(n-1,src, dest, helper);
        System.out.println("disk "+n+" transfered from "+src +" to "+dest);
        
        hanoi(n-1,helper,src,dest);
        // System.out.println("disk "+n+" transfered from "+src +" to "+helper);
        

        // hanoi();
    }
    public static void main(String args[]){
        hanoi(4, "S", "H", "D");  
    }
}
