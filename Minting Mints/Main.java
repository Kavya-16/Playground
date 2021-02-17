import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int sum=sc.nextInt();
    int n=sc.nextInt();
    int arr[]=new int[n];
    arr[0]=sum;
    for(int i=1;i<n;i++){
      arr[i]=sum-1;
      sum=sum+arr[i];}
    System.out.println(sum);
  }
}