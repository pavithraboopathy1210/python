package func;
public class Function{
    void display(){
System.out.println("Hello");
    }
    /* void display(){
System.out.println("two");
    }*/
      void display(int a){
System.out.println(a*10);
    }
    public static void main(String[] args) {
        Function obj1=new Function();
        obj1.display();
        obj1.display(34);
    }
}