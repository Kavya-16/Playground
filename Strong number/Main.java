import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=n;
    int rem=0,sum=0;
    while(n!=0){
      rem=n%10;
      sum=sum+fact(rem);
      n/=10;}
    if(sum==temp){
      
         System.out.println("Yes");}
      else
      {
        System.out.println("No");
      }
      
  }
  public static int fact(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
      fact=fact*i;}
    return fact;}
}