package friend;
import java.util.*;
class Stringbuilder{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     StringBuffer obj=new StringBuffer("hello");
     obj=obj.append("world");
     System.out.println(obj);
     obj.insert(0,"User ");
     System.out.println(obj);
     obj.delete(0,5);
     System.out.println(obj);
     obj.replace(0,1,"w");
                                                                                                                   