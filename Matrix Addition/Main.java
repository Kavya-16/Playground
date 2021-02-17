import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      int n=sc.nextInt();
      int m=sc.nextInt();
      int arr[][]=new int[n][m];
      int arr1[][]=new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          arr1[i][j]=sc.nextInt();
        }
      }
      int res[][]=new int[n][m];
      for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
          res[i][j]=arr[i][j]+arr1[i][j];
          System.out.print(res[i][j]+" ");
        }
      }
      System.out.println();
    }
  }
}