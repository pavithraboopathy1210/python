
import java.util.Scanner;

public class TryAndCatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int a=sc.nextInt();
            //int b=10/0;
         
            throw new Exception();
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
}