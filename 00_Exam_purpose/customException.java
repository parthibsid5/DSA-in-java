public class customException {
    public static void main(String[] args) {
        int i = 2; // Example value, you can change it to test different scenarios
        int j = 0;
        try {
            j = 9 / i;
            if (i == 2) {
                throw new MyException("Final Boss exception");
            }
        } catch (MyException me) {
            System.out.println(me);
        } catch (Exception e) {
            System.out.println("cannot divide by 0!\n");
        }
    }
}
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}