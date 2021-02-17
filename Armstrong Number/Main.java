import java.util.*;
import java.lang.*;
class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp, remainder, result = 0, n = 0 ;
		temp = number;
		while (temp != 0)
		{
			temp /= 10;
			++n;
		}
		temp = number;
		while (temp != 0)
		{
			remainder = temp%10;
			result += Math.pow(remainder, n);
			temp /= 10;
		}


		if(result == number)
		System.out.print("ARMSTRONG");
		else
		System.out.print("NOT AN ARMSTRONG");
	}
}