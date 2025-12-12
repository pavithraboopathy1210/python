                  //STATIC METHODS
/*public class Function{
    public static void main(String[] args) {
        add(10,48);
        System.out.println("add is"+add(10,56));
    }
    public static int add(int a,int b){
       
        return a+b;
    }
}*/
                    // METHODS WITH AND WITHOUT PARAMETER AND METHOD OVEERLOADING
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