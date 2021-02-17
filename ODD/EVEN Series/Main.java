import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pos=0;
    if(n%2==0){
      pos=(n/2)-1;}
    else{
      pos=n-1;}
    System.out.println(pos);
  }
}