import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(str.replaceAll("[aeiouAEIOU]", ""));
  }
}