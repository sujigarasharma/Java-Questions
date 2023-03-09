// Java Program to find the Square Root 
// Developed for CSC3001 0n 10/02/2021

import java.lang.Math; 
import java.util.Scanner;  

public class Squareroot
{

	public static void main(String args[]) 
	{
        
		Scanner sc= new Scanner(System.in); 	
		System.out.print("Enter The Number : ");  
		double n= sc.nextDouble();  
        		
		double result;
		result = Math.sqrt(n);
		System.out.print("The Result is :" + result);
    	}
}