class Demothread {
    public static void main(String args[]){
        A a =new A();
      B b =new B();
      a.start();
      b.start();

}
}

class A extends Thread{
    public void run(){
        for(int i=1;i<1000;i++){
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("hello");
        }
    }
}


// by extending thread class