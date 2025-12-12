                      //STATIC VARIABLE     //STATIC METHODS
package tools;
class Mobile{
    String brand;
    int price;
    static String name="touch phone";
    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
    static void show1(){
        System.out.println("my name is pavithra");
    }
}
public class Sstatic{
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        Mobile obj2=new Mobile();
        obj1.brand="Apple";
        obj1.price=19000;
        //obj1.name="smartphone";
        obj2.brand="samsung";
        obj2.price=16500;
        //obj2.name="smartphone";
        //Mobile.name="phone";
        obj1.show();
        obj2.show();
        Mobile.show1();

    }
}
                                    
