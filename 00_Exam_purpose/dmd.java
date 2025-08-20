class dmd {
    public static void  main(String args[]){
    A obj =new A();
    obj.show();

    obj=new B();
    obj.show();

    obj=new C();
    obj.show();
// dynamic method dispatch


Final f=new Final();
f.demo();
    }
}

class A{
    public void show(){
        System.out.println("This is A");
    }
}

class B extends A{
    public void show(){
        System.out.println("This is B");
    }
}
class C extends A{
    public void show(){
        System.out.println("This is C");
    }
}
class Final{
    void demo(){
        int a=5;
        final int b=8; //similar to const in c++
        a=a+1;
        // b=b+1; //cannot modify!
        System.out.println(a+" "+b);
    }
}