import java.util.*;
import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long result = 1l;
        int base=s.nextInt();
        int exponent=s.nextInt();
        if(base!=0 && exponent>=0)
        {
            while (exponent != 0)
            {
                result *= base;
                --exponent;
            }
            System.out.print(result);
        }
        else
            System.out.print("Wrong input");
    }
}