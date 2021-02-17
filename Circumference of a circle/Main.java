import java.util.*;
import java.lang.*;
class Main { 
      static double circumference(double r){ 
  
        double PI = 3.14; 
        double cir = 2*PI*r; 
        return cir; 
    } 
    public static void main (String[] args) { 
      Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double result = circumference(r);
        System.out.printf("%.2f",result); 
    } 
} 