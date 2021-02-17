import java.util.*;
import java.io.*;


class Main 
{ 
	static int largest() 
	{ 
	     Scanner s = new Scanner(System.in);
      int length = s.nextInt();
      int [] arr = new int[length];
     
      for(int i=0; i<length; i++ ) 
         arr[i] = s.nextInt();
	    
		int i; 
		int max = arr[0]; 
		for (i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 
		return max; 
	} 
	
	public static void main(String[] args) 
	{ 
		System.out.println(largest()); 
	} 
} 

