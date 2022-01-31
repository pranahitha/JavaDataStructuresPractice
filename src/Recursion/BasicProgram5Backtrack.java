package Recursion;

import java.util.Scanner;

//to print numbers reverse from n to 1 using backtrack in recursion

public class BasicProgram5Backtrack {
	public static void reverseLinearBacktrack(int i,int n)
	{
		if(i>n)
			return ;
		reverseLinearBacktrack(i+1,n);
		System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		reverseLinearBacktrack(1,n);
	}
	

}
