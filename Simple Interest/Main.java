import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    float p=sc.nextFloat();
    float y=sc.nextFloat();
    float r=sc.nextFloat();
    float result=(p*y*r)/100;
    System.out.printf("%f",result);
  }
}