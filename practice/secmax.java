// find second max in java 
public class secmax {
    public static void main(String args[]){
        int arr[]={12,35,1,10,34,1,35};
        int max=arr[0];
        int secmax=arr[0];
        // TX=O(n)
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(max>arr[i] && secmax<arr[i]){
                secmax=arr[i];
            }
        }
        System.out.println("Max : "+max+"\n"+"Secmax : "+secmax);
    }
}
// we could also use sorting first then from back find the second largest, leaving the occuring ones
// TX=O(nlog n) due to sorting algo!
// or we could have  2 loops 1st for max 2nd for secmax; TX= O(n^2)