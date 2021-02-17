import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    float radius=sc.nextFloat();
    float center=sc.nextFloat();
    float out=(float)(3.14*radius*2)*(center/360);
    System.out.printf("%.2f",out);
  }
}