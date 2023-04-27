// Java program to illustrate 
// redeclaring a variable 
// in initialization block 
public class Example4 
{ 
	public static void main(String[] args) 
	{	 
		// x is integer 
		int x = 0; 
		long y = 10; 
		
		for (y = 0, x = 1; x < 5; x++) 
		{ 
			System.out.print(x + " "); 
		} 
		
	} 
} 
