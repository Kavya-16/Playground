import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    if(year%4==0&&year%100!=0||year%400==0)  
       System.out.println("LEAP YEAR");
    else
      System.out.println("NOT LEAP YEAR");
  }
}