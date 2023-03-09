import java.util.*;  

public class Palindrome{
   
    public static void main(String[] args) {
	Scanner sc= new Scanner(System.in); 	
	System.out.print("\nEnter The String to Find Palindrome or Not : ");  
	String str= sc.next(); 
	StringBuilder sb= new StringBuilder(str);
	sb.reverse();   
	
      	String rev=sb.toString();   
	
	if(str.equals(rev))
	{
		System.out.println("The String is a Palindrome\n");	
	}
	else
	{
		System.out.println("The String is Not a Palindrome\n");	
	}
    }
}