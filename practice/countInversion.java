import java.util.*;

class countInversion {
    static int count=0; 
    public static void main(String args[]) {
        int arr[] = { 5, 2, 6, 1 };
        divide(arr, 0, arr.length-1);
        System.out.println(count);
    }
    
    static void divide(int arr[], int start, int end) {
        // System.out.println("1");
        if(start>=end) return;
        int mid;
        mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid + 1, end);
        
        conquer(arr, start,mid, end);
    }
    
    static void conquer(int arr[], int start, int mid,int end) {
        ArrayList<Integer> merge = new ArrayList<>();
        int ptr1 = start, ptr2 = mid + 1;
        
        while(ptr1<=mid && ptr2<=end){
            if(arr[ptr1]>arr[ptr2]){
                merge.add(arr[ptr2]);
                ptr2++;
                count+=mid-ptr1+1;
            }
            else{
                merge.add(arr[ptr1]);
                ptr1++;
            }
        }
        while(ptr1<=mid){
            merge.add(arr[ptr1]);
            ptr1++;
        }
        while(ptr2<=end){
            merge.add(arr[ptr2]);
            ptr2++;
        }
        for (int i = 0; i < merge.size(); i++) {
    arr[start + i] = merge.get(i);
}

    }
}
