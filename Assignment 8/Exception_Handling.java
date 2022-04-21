import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception_Handling {
    static void Exception_method()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        String s=null;
        int arr[]=new int[5];
        System.out.println("enter a,b values");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            if (b == 0) {
                c = a / b;
            }
            System.out.println("lenght of str "+s.length());
            arr[10]=56;

        }
        catch (Exception e)
        {
            System.out.println("Here is a exception \n");
            System.out.println(e);
        }
        finally {
            System.out.println("this is finally cluse which executes all the time");
        }
    }
    public static void main(String args[]){
        Exception_Handling.Exception_method();
    }
}