import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    decii(n);
  }
  static void decii(int n){
    int deci[]=new int[100];
    int i=0;
    while(n!=0){
      deci[i]=n%2;
      n/=2;
      i++;}
    for(int j=i-1;j>=0;j--)
        System.out.print(deci[j]);}
}