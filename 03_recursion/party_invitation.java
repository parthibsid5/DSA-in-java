// Find The number of ways in which you can invite 'n' people to your party single or in pairs


public class party_invitation {
    public static void main(String rags[]){
        int n=3;
        int ways=invite_ways(n);
        System.out.println(ways);
    }
    public static int invite_ways(int n){
        if(n<=1){
            return 1;
        }
        int single=invite_ways(n-1);
        int pairs=(n-1) * invite_ways(n-2);

        return single+pairs;

    }
    
}
