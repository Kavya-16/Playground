import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    int lo=sc.nextInt();
    int up=sc.nextInt();
    for(int i=lo;i<=up;i++){
      if(up>=100)
        System.out.printf("%03d ",i);
      else if(up>=10)
         System.out.printf("%02d ",i);  
      else
        System.out.printf("%d ",i);}
  }
}