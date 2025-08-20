public class implementRunnable {
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();

        Thread t1=new Thread(ob1);
        Thread t2=new Thread(ob2);
        t1.start();
        t2.start();
    }
}


class A implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("hi");
    }}
}
class B implements Runnable{
    public void run(){
        for(int i=0;i<500;i++){
        System.out.println("helo");
    }}
}


// by implementing runnable class 