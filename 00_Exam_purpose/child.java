class child extends Parent{
    public static void main(String[] args) {
        // Parent si=new child();  //dmd
        child si=new child();  
// child ch=new Parent();
        si.show();
    }
    void show(){
        System.out.println("this is child class");
    }
}

class Parent{
    void show(){
        System.out.println("this is parent");
    }
}