package Recursion;
//WAP to print linear numbers in reverse order using recursion

import java.util.Scanner;
public class BasicProgram3 {
	public static void reverseLinearly(int i,int n)
	{
		if(i<1)
			return;
		System.out.println("number : "+i);
		reverseLinearly(i-1,n);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		reverseLinearly(n,n);
	}
}
