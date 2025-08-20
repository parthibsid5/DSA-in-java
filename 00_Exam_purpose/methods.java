class methods {
    public static void main(String args[]){
    A obj2=new A();
    A.result(6);
    A.result(6,4);


    B obj=new C();
    obj.show();



    }
}
class A{
    static void result(int x){
        System.out.println("this has 1 param");
    }
    static void result(int x,int y){
        System.out.println("this has 2 param");
    }
}

class B{
    void show(){
        System.out.println("parent show");
    }
}
class C extends B{
    void show(){
        System.out.println("child show");
    }

}
