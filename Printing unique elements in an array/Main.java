import java.util.*;
import java.io.*;

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
    int flag=0;
    for(int i=0;i<n;i++){
      flag=0;
      for(int j=0;j<n;j++){
       if(arr[i]==arr[j]&&i!=j){
        // System.out.print(arr[i]+" ");
         flag=1;
         break;
       }
      }
      if(flag==0){
        System.out.print(arr[i]+" ");
      }
      
    }
  }
}