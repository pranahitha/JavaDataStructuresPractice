package Recursion;
// Factorial of n using recursion

import java.util.Scanner;

public class BasicProgram7 {
	public static int factorial(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n * factorial(n-1);
		
	}
public static void main(String[] args) {
	

	 Scanner sc = new Scanner(System.in);
	 int n=sc.nextInt();
	 System.out.println(factorial( n));
	 
}
}
