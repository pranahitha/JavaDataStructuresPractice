package Recursion;

import java.util.Scanner;

//print numbers from 1 to n using backtracking in recursion
public class BasicProgram4Backtrack {
	public static void backtrackLinear(int i,int n)
	{
		if(i<1)
			return;
		backtrackLinear(i-1,n);
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		backtrackLinear(n,n);
		
		
	}
}
