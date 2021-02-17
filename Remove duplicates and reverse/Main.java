import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
   LinkedHashSet<Character> had=new LinkedHashSet<Character>();
    for(int i=str.length()-1;i>=0;i--){
      had.add(str.charAt(i));}
    for(Character ch:had){
      System.out.print(ch);}
    
    
  }
}