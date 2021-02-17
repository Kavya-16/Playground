import java.util.*;
import java.io.*;

class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    String text=sc.nextLine();
    int count=0;
    for(int i=0;i<text.length()-1;i++){
      if(text.charAt(i)==' '){
        count++;
      }
    }
    System.out.println(count+1);
    
    
  }
}