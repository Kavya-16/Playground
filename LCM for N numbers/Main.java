import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println(lcm(arr));
    
  }
  public static long lcm(int arr[]){
    long lcm=1;
    int divisor=2;
    while(true){
      int count=0;
      boolean divisible=false;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
          return 0;
        }
        else if(arr[i]<0){
          arr[i]=arr[i]*(-1);
        }
        if(arr[i]==1){
          count++;
        }
        if(arr[i]%divisor==0){
          divisible=true;
          arr[i]=arr[i] / divisor;
        }
      }
        if(divisible){
          lcm=lcm*divisor;}
        else{
          divisor++;
        }
        if(count==arr.length){
          return lcm;
        }
      }
    
  }
}