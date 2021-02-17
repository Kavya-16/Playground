import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
    System.out.println(gcd(a,b));
  }
  public static int gcd(int a,int b){
    if(b==0)
      return a;
    return gcd(b,a%b);}
}