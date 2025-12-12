abstract class Vehicle{
    abstract void speed();
    void brand(){
        System.out.println("XYZ brand");
    }
}
class Bike extends Vehicle{
    void speed(){
        System.out.println("50 kmph");
    }
}
public class Abstract{

    public static void main(String[] args) {
        Bike obj1=new Bike();
        obj1.speed();
        obj1.brand();

    }
}
