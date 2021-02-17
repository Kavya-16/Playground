import java.util.*;
import java.io.*;
class Main
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   char ch=sc.next().charAt(0);
   // char ch=h.toLowerCase();
    if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
      System.out.println("Vowel");
    }
    else{
     // if(ch>'a' &&ch<='z'){
        System.out.println("Consonant");
      //}
    }
  }
}