package Recursion;
import java.util.Scanner;
//Write a java program to print numbers linearly from 1 to n using recursion
public class BasicProgram2 {
	public static void linearly(int i,int n)
	{
		if(i>n)
			return;
		System.out.println("number : "+i);
		linearly(i+1,n);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		linearly(1,n);
		
	}
}
