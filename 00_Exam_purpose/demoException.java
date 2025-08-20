public class demoException {
    public static void main(String[] args) {
        int i=1;
        int j=0;
        int nums[]=new int[5];
        String str=null;
        try
        {
        j=9/i;
        System.out.println(str.length());
        System.out.println(nums[0]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by 0!\n");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array out of bound");
        }
        catch(Exception e){
            System.out.println("something went wrong!"+e);
        }
        System.out.println(j);

        System.out.println(2+2);
    }
}