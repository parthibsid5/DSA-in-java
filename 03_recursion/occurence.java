public class occurence {
    public static int first=-1;
    public static int last=-1;

    public static void find_occurence(String s,int idx, char Findelement){
        if(idx==s.length()){
            System.out.println((first));
            System.out.println((last));
            return;
        }
        char currElement=s.charAt(idx);
        
        if(currElement==Findelement){
            if(first==-1){
                first=idx;
                // find_occurence(s, idx+1, Findelement);
            }
            else{
                last=idx;
                // find_occurence(s, idx+1, Findelement);
            }
        }
        find_occurence(s, idx+1, Findelement);
            
    }
    public static void main(String args[]){
        find_occurence("geekforgeeks", 0, 'k');
    }
}
