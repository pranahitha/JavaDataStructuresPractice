package Recursion;
//Sum of n numbers using recursion

import java.util.Scanner;

public class BasicProgram6 {
	public static int sumOfNumbers(int start,int n,int sum)
	{
		if(start<=n)
			return sumOfNumbers(start+1,n,sum+start); 
		return sum;
	}
	public static int sumofFirstN(int i,int sum)
	{
		if(i<1)
			
			return sum;
			
		return sumofFirstN(i-1,sum+i);
	}
	public static int functionalSumofN(int n)
	{
		if(n==0)
			return 0;
		return n+functionalSumofN(n-1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		System.out.println(sumOfNumbers(1,n,sum)); //type 1trial
		System.out.println(sumofFirstN(n,sum));    //type 2- parameterized
		System.out.println(functionalSumofN(n));  //type 3 - functional
	}

}
