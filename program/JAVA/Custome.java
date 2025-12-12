import java.util.*;
class NotValidException extends Exception{
    public NotValidException(String s){
        super(s);
    }
}
class Custome {
public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
 try {
 int a=sc.nextInt();
 if(a<18){
throw new NotValidException("Your age should be grater then 18");
 }
 }
 catch (NotValidException e) {
System.out.println(e);
 }
 catch(Exception e){
System.out.println(e);
 }
 }
}