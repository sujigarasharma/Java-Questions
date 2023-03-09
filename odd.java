import java.util.*;  

public class odd{

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("\nEnter The Number to check odd or even : ");  
	int n= sc.nextInt();  

	if(n%2==0)
	{
		System.out.print("\nThe number is even Number\n");
	}
	else
	{
		System.out.print("\nThe number is odd Number\n");
	}
        
    }
}