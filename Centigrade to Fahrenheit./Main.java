import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    float C=sc.nextInt();
    double F;
    F = (1.8) *C + 32;
    System.out.printf("%.2f",F);
  }
}