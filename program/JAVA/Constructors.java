//Default Constructors
/*class Sample{
    int rollno;
    int mark;

   Sample(){
    System.out.println("This is default constructor");
    rollno=71;
    mark=45;
   }
}
public class Constructors{
    public static void main(String[] args){
        Sample obj=new Sample();
        System.out.println(obj.rollno);
        System.out.println(obj.mark);
    }
}*/


                             //parameterized Constructors
/*class Sample{
    int rollno;
    int mark;

   Sample(int num,int marks){
    System.out.println("This is default constructor");
    rollno=num;
    mark=marks;
   }
}
public class Constructors{
    public static void main(String[] args){
        Sample obj=new Sample(78,33);
        System.out.println("your roll no is"+obj.rollno);
        System.out.println("Your mark is"+obj.mark);
    }
}*/
                               //COPY CONSTRUCTOR

class Constructors{
    int id;
    String name;
    Constructors(int i,String s){
        id=i;
        name=s;
    }
    Constructors(Constructors ct){
        id=ct.id;
        name=ct.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        Constructors ct1=new Constructors(1,"Ravi");
        Constructors ct2=new Constructors(ct1);
        ct1.display();
        ct2.display();
    }
}