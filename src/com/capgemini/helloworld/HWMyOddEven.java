package com.capgemini.helloworld;
import java.util.Scanner;

public class HWMyOddEven 
{
	public static void main(String args[])
	{
		int n;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number: ");
		n=s.nextInt();
		if (n>0)
		{
			System.out.println("Positive");
			if (n%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("None");
		}
	}

}
