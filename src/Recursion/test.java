package Recursion;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p=sc.nextInt();
		if(p>200 ||p<100)
		{
			System.out.println("INVALID INPUT");
		}else
		{
			int a,b,c,d;
			if(p%2==0)
			{
			 a=p/4;

			b=c=d=a;
			}else
			{
			int rem=p%4;
			a=p/4;
			b=c=d=a;
			d+=rem;
			}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		}
	}

}
