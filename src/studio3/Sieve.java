package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//
//		algorithm Sieve of Eratosthenes is
//	    input: an integer n > 1.
//	    output: all prime numbers from 2 through n.
//
//	    let A be an array of Boolean values, indexed by integers 2 to n,
//	    initially all set to true.
//	    
//	    for i = 2, 3, 4, ..., not exceeding √n do
//	        if A[i] is true
//	            for j = i2, i2+i, i2+2i, i2+3i, ..., not exceeding n do
//	                set A[j] := false
//
//	    return all i such that A[i] is true.
		
		System.out.println("How many numbers?");
		int n = in.nextInt();
		
		boolean[] numbers = new boolean[n];
		
		for(int i = 0; i < numbers.length - 1; i++)
		{
			numbers[i] = true;
		}
		for(int k = 2; k < Math.sqrt(n); k++)
		{
			if (numbers[k] == true)
			{
				for(int j = (k*k); j < n; j += k)
				{
//					System.out.println(k);
//					System.out.println(j);

					numbers[j] = false;
					
				}
			}
		}
		
		for(int u = 2; u < numbers.length - 1; u++)
		{
			if (numbers[u] == true)
			{
				System.out.println(u);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
