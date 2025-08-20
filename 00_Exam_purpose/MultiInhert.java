interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("This is  A");
    }

    public void methodB() {
        System.out.println("This is  A");
    }
}
class MultiInherit{
    public static void main(String a[]){
        C obj=new C();
        obj.methodA();

        // error since the reference type is of Class A That means we can only access the methods of InterfaceA and not of B
        // A obj=new C();
        // obj.methodB();
    }
}