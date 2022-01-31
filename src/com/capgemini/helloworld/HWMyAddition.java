package com.capgemini.helloworld;
import java.util.Scanner;

public class HWMyAddition 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number1: ");
		int a=s.nextInt();
		System.out.println("Enter number 2: ");
		int b=s.nextInt();
		
		//Add
		int add=a+b;
		System.out.println("Total: "+add);
	}

}
