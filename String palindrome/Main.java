import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    //char str[]=ch.charArray[];
    int flag=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)!=str.charAt(str.length()-i-1)){
       flag=1;
      }
      else{
        flag=0;
        }}
    if(flag==1){
      System.out.print(str +" is not a palindrome");
    }
    else{
      System.out.print(str + " is a palindrome");}
  }
}