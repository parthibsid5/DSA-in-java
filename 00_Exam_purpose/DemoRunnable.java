class DemoRunnable {
    public static void main(String args[]){
        A a =new A();
      B b =new B();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
      t1.start();
      t2.start();
}
}

class A implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hi");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("hello");
        }
    }
}
