import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();}
    System.out.println(findgcd(arr,n));
  }
  public static int gcd(int a,int b){
    if(a==0)
      return b;
    return gcd(b%a,a);  
    }
    public static int findgcd(int arr[],int n){
      int result=0;
      for(int elemnt:arr){
          result=gcd(result,elemnt);
           if(result==1){
                return 1;}
      }
      return result;
    }
}