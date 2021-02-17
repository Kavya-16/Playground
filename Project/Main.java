import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();}
    int j=1;
    int count=0;
    while(true){
      if(j!=n){
        if(arr[n-j]!=0){
          count++;
          arr[n-j]--;
          count++;
          arr[0]--;
        }
        else{
          j++;
        }
      }
      else{
        break;
      }
    }
    System.out.println(count+1);
    
  }
}