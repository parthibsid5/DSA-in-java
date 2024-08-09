// check an array is strictly increasing array or not.
// O(n)

public class strictly_inc {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 2, 3, 6, 7 };
        boolean res = increasing(0, arr);
        System.out.println(res);
    }

    public static boolean increasing(int i, int arr[]) {
        if (i == arr.length - 1) {
            return true;
        }
        int fir = arr[i];
        int sec = arr[i + 1];
        // if (fir < sec) {
        //     return increasing(i + 1, arr);
        // } else {
        //     return false;
        // }

        if(fir>=sec){
            return false;
        }
        return increasing(i+1, arr);

    }
}
