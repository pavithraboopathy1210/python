class Fun{
    void fun2() throws Exception{
        int a=10/0;
    }
}
public class Tthhrows{
    public static void main(String[] args) {
        Fun f=new Fun();
        try {
            f.fun2();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}