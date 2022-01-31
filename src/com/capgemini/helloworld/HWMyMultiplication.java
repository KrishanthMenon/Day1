package com.capgemini.helloworld;
import java.util.Scanner;

public class HWMyMultiplication 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int a=s.nextInt();
		System.out.println("Enter number 2: ");
		int b=s.nextInt();
		System.out.println("Total: "+a*b);
		
	}

}
