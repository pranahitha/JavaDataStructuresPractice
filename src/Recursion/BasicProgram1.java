package Recursion;
import java.util.Scanner;


//Write a java program to print name n times using recursion
public class BasicProgram1 {
	public static void printName(int n,String name)
	{
		if(n==0)
			return;
	
		System.out.println("Hi "+name);
		printName(n-1,name);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String name=sc.next();
		printName(n,name);
	}

}
