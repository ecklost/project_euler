
public class Euler_7 
{

	public static void main(String[] args) 
	{
		// Taken from Project Euler's Problem #7 
		
			//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
			// 	What is the 10,001st prime number?
		findPrime();
	}
	
	public static boolean determinePrime(int number)
	{
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
