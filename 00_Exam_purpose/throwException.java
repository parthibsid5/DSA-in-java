public class throwException {
    public static void main(String[] args) {
    int i=2;
    int j=16;
    int arr[]=new int[4];
        try{
        j=j/i;
        if(i==2){
            throw new Exception();
        }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    catch(Exception e){
        System.out.println(e);
    }
    System.out.println(j);
}
}
