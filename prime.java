// Java Program to find the prime or not
// Developed for CSC3001 0n 10/02/2021

import java.lang.Math; 
import java.util.*;  

public class prime{

    public static void main(String[] args) {
        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("Enter The Number : ");  
	int n= sc.nextInt();  
        int i,count;
	i=n;
	count=0;
	while(i>=1 && i<=n)
	{
		if(n%i==0)
		{
		count++;
		}
		
		i--;
	}
	if(n==1)
	{
		System.out.print("The Number is Neither Prime nor Composite\n");
	}
	else if(count==2)
	{
		System.out.print("The Number is Prime Number\n");
	}
	else
		System.out.print("The Number is Not a Prime Number\n");
    }
}