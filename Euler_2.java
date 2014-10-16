package euler_1_to_25;

public class Euler_2 {

	public static void main(String[] args) {
		// From Project Euler's Number 2 Problem:
		
	    // Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
		// By starting with 1 and 2, the first 10 terms will be:
		//
		// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
		//
		// By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
		// find the sum of the even-valued terms.
		
		// If you are coming from Project Euler, and have not done the answer, please turn around. Try
		// solving the problem yourself!
		
		// =============
		// Preconditions
		// =============
		// 1) The term must be even.
		// 2) The sequence cannot go over four million.
		
		// =====
		// Goals
		// =====
		// 1) Create a standard Fibonacci sequence. 
		// 2) Then, add the even number terms. 
		
		int runningTotal = 0;
		int lowFibo = 1;
		int highFibo = 2;
		int overallTerm = 0;
		
		while (overallTerm < 4000000)
		{
			overallTerm = lowFibo + highFibo;
			lowFibo = highFibo;
			
			if (highFibo % 2 == 0)
			{
				runningTotal += highFibo;
			}
			
			highFibo = overallTerm;
		}
		
		System.out.println("The overall sum is: " + runningTotal);
	}

}