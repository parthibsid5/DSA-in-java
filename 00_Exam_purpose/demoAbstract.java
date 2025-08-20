public class demoAbstract {
    public static void main(String args[]) {
        // cannot create oj of 'abstract' class

        // car c = new car();
        // car c = new rangeRover();

        // but we can create instance of object class

        car c = new landRover();
        c.drive();
        c.playmusic();
        c.fly();
    }
}

abstract class car{
    public abstract void drive(); //abstract 'method'
    public abstract void fly();

    void playmusic()  //concrete 'method'
    {
        System.out.println("Music play..");
    }
}
abstract class rangeRover extends car{
    public void drive(){
        System.out.println("Driving..");
    }
}
class landRover extends rangeRover //concrete 'class'
{
   public void fly(){
        System.out.println("Flying..");
    }
}
