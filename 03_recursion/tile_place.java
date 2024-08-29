public class tile_place {
    public static void main(String args[]){
        int m=4,n=2;
        int result=calculateTiles(m,n);
        System.out.println(result);
    }
    public static int calculateTiles(int m, int n){
        if(m==n){
            return 2;
        }
        if(n<m){
            return 1;
        }
        // if(n>m){
        //     return 1;
        // }
        int vertical=calculateTiles(m, n-m);
        int horizontal=calculateTiles(m, n-1);

        return vertical+horizontal;
    }

}
