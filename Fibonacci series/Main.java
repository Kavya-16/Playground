import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
    System.out.print(fibbo(i)+" ");
    }
  }
  public static int fibbo(int n){
    if(n<=1)
      return n;
    return (fibbo(n-1)+fibbo(n-2));
  }
}