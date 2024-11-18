class Main {
    
    public static void main(String args[]){
    //     int arr[]={1,2,3};
    //     int n=arr.length;
    //     int c1=0,c2=n-1;
    //     while(c1<c2){
    //         // System.out.println("one");
    //         if(arr[c1]==0 && arr[c2]==0){
    //             c2-=1;
    //         }
    //         else if(arr[c1]==0 && arr[c2]!=0){
    //             int temp=arr[c1];
    //             arr[c1]=arr[c2];
    //             arr[c2]=temp;
    //             c2-=1;
    //             c1+=1;
    //         }
    //         else if(arr[c1]!=0 && arr[c2]==0){
    //             c1+=1;
    //         }
    //         else if(arr[c1]!=0 && arr[c2]!=0){
    //             c1+=1;
    //         }
    //         else{
    //             continue;
    //         }
    //     }
    //     for(int i=0;i<n;i++){
    //         System.out.print(arr[i]);
    //     }

    // 

    int arr[]={1,2,0,3,0,0,4,5,0,6};
    Solution sol=new Solution();
    sol.pushZerosToEnd(arr);
    }
}
class Solution {

    void pushZerosToEnd(int[] arr) {
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                c++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}

