
public class Interface{
    public static void main(String args[]){
    A obj;
    obj=new B();
    obj.show();
    obj.config();

    System.out.println(A.age);
    // unchangable since constant!

    // obj.age=33;
    // obj.region="Malaysia";
    }
}
interface  A {
    void show();
    void config();
    // interface gives us the outline of how the functions are to be used , then we need to implement them 
    
    // if we are creating variables then by default these are final and static , i.e "unchangable", and "class call"
    int age=32;
    String region="Singapore";
}
class B implements A{
    public void show(){
        System.out.println("This is show");
    }
    public void config(){
        System.out.println("This is config");
    }
}



interface Int_One{
    void show_A();
}

interface Int_Two{
    void show_B();
}

class pussy implements Int_One, Int_Two {
    public void show_A(){
        System.out.println("this is interface 1");
    }
    public void show_B(){
        System.out.println("this is interface 2");
    }
    public static void main(String args[]){
        pussy slut=new pussy();
        slut.show_A();
        slut.show_B();
    }
}
