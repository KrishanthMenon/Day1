package com.capgemini.helloworld;
import java.util.Scanner;

public class MyLeapYear 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year: ");
		int year = s.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("It is a Leap Year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
			else
			{
				System.out.println("Not a Leap Year");
			}
		}
		else
		{
			System.out.println("Undefined");
		}
		}

}
