package com.capgemini.helloworld;

import java.util.Scanner;

public class MyLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if(year%4==0 && year%400==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}