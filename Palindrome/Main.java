import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   int temp=n;
    int rev=0,rem=0;
    while(n!=0){
      rem=n%10;
      rev=rev*10+rem;
      n/=10;
  }
    if(temp==rev){
      System.out.println("Palindrome");
    }else{
       System.out.println("Not a Palindrome");}
  }
}