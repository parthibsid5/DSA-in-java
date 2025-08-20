public class thisIsSuper {
    public static void main(String args[]){
        B obj=new B();
    }
}
class A {
    A(){
        System.out.println("A default");
    }
    A(int a){
        // this();
        System.out.println("A param :"+a);
    }
}
class B extends A{
    B(){
        // super(10);
        this(10);
        System.out.println("B default");
    }
    B(int b){
        System.out.println("B param :"+b);
    }
}


