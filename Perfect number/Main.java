import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    for(int i=1;i<n;i++){
      if(n%i==0){
        sum+=i;}}
    if(n==sum)
       System.out.println("Yes");
    else
      System.out.println("No");
  }
}