class Inheritance {
    public static void main(String a[]) {
        Parent par = new Child();
        par.position();
        par.show();
        // Since show method is overridden by its child class. So child show method is
        // called

        // As the reference type is of parent class, so calling age function will give
        // an error since this function does not exist in parent class
        // par.age();
    }
}

class Parent {
    int x = 20;

    void show() {
        System.out.println("This is parent");
    }

    void position() {
        System.out.println("I am above in hierarchy");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is child");
    }

    void age() {
        System.out.println("This is the age function");
    }

//     public static void main(String a[]) {
//         Parent obj = new Child();
//         obj.show();
//         System.out.println(obj.x);
//     }
}