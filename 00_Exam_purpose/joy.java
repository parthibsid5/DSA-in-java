class joy{
    public static void main(String a[]){
        B obj=new B(25);
    }
}

class A{
    A(){
        System.out.println("hello A");
    }
    A(int x){
        System.out.println("param A");
    }
}
class B extends A{
    B(){
        this(30);
        System.out.println("hello B");
    }
    B(int a){
        // this();
        System.out.println("param B");
    }
}
