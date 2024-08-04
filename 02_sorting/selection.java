import java.util.Arrays;

public class selection {
    public static void main(String args[]){
        int arr[]={5,1,2,0,3,2,1,5,9,7,5,2,6,8,3,2,1};
        int small;
        for (int i = 0; i < arr.length-1; i++) {
            small=arr[0];
            int p=0;
            for (int j = i; j < arr.length-1; j++) {
                if(small>=arr[j])
                {
                    small=arr[j];
                    p=j;
                }                
            }
            arr[p]=arr[i];
            arr[i]=small;
        }
        System.out.println(Arrays.toString(arr));
    }
}
