import java.util.*;
public class bubble {
    public static void main(String argas[]){
        int []arr={5,1,2,0,3,2,1,5,9,7,5,2,6,8,3,2,1};
        int l=arr.length,temp;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The sorted array is :"+Arrays.toString(arr));
    }
    
}
