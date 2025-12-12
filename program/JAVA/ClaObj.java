public class ClaObj{
    String name;
    int roolno;
    public void display(){
        System.out.println(name);
        System.out.println(roolno);
    }
    public static void main(String args[]) {
        ClaObj obj=new ClaObj();
        obj.name="pavithra";
        obj.roolno=1234;
        obj.display();
    }
}