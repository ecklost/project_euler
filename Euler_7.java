
public class Euler_7 
{

	public static void main(String[] args) 
	{
		// Taken from Project Euler's Problem #7 
		
			//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
			// 	What is the 10,001st prime number?

		// This problem seems fairly simple to understand. Inherently, there are a
		// few conditions to understand.
		
		// =============
		// Preconditions
		// =============
		//
		// 1) Prime numbers cannot be divisible by any other number except one and itself.
		// 
		// =============
		//      End
		// =============
		//
		// A number can be ran through a for loop a number of times. The terminating condition can be
		// some variable equaling 10001. Each time there is prime number found, it will be added to the overall
		// total. Even numbers can be disregarded as they cannot be prime numbers.
		
		findPrime();
	}
	
	public static boolean determinePrime(int number)
	{
		// Start and go from 2 to the square root of the number.
		
		for (int start = 2; start <= (int)Math.sqrt(number); start++)
		{
			if (number % start == 0) return false;
		}
		return true;

	}
	
	public static void findPrime()
	{	
		for (int number = 3, primeCounter = 1; primeCounter <= 10000; number += 2)
		{
			if (determinePrime(number) == true)
			{
				System.out.println(number);
				primeCounter++;
			}
		}
	}
} // End class
