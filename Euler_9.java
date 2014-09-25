
public class Euler_9 {

	public static void main(String[] args) 
	{
		
		// Problem attempt by Eric C. Klostermeyer (github user name: ecklost)
		// From Project Euler's #9 problem:

			// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
			// a^2 + b^2 = c^2
			
			// For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
			
			// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
			// Find the product abc.

		// =============
		// Preconditions
		// =============
		// 1) Three numbers in which a < b < c
		// 2) a^2 + b^2 = c^2, or the Pythagorean theorem.
		// 3) a + b + c = 1000
		
		// After these three conditions are met, the product can be determined.
		// Cycling through all the numbers would be a possibility, but might take
		// a long time to compute. The search can be refined in a number of ways.
		// For instance, the second and third precondition can have numbers 

		System.out.println("Executing...\n");
		
		findSetOfNumbers(); // The only piece of code main implements is this method.
							// The main method is out of the picture at this point.
		
		System.out.println("Ending...");
	}

	public static boolean isThousand(int a, int b,  int c) 
	{		
		// Checks to see if the three numbers add up to 1000.
		
		return (a + b + c == 1000);	
	}
	
	public static boolean isPythagorean(int a, int b, int c)
	{
		// Checks to see if a^2 + b^2 = c^2
		
		return (a*a + b*b == c*c);
	}
	
	public static boolean isLessThan(int a, int b, int c)
	{
		// Checks the first precondition: a < b < c
		
		return ((a < b) && (b < c));
	}
	
	public static void findSetOfNumbers()
	{	
		for (int c = 1; c < 1000; c++)
		{
				for (int b = 1; b < 1000; b++)
				{
						for (int a = 1; a < 1000; a++)
						{
							if (isPythagorean(a,b,c) && isThousand(a,b,c) && isLessThan(a,b,c)) 
							{
								// System.out.println(a + " " + b + " " + c + "\n");
								System.out.println("The product is: " + (a*b*c) + "\n");
								
							}
						}
				}
		}
		
	}
}
