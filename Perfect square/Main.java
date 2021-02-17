import java.util.*;
import java.lang.*;
class Main { 
    static boolean isPerfectSquare(double x)  
    { 
        double sr = Math.sqrt(x);  
        return ((sr - Math.floor(sr)) == 0); 
    }       
    public static void main(String[] args)  
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (isPerfectSquare(x)) 
            System.out.print("YES"); 
        else
            System.out.print("NO"); 
    } 
}