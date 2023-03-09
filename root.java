import java.util.*;  
import java.lang.Math; 

public class root{

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	

  	System.out.print("Enter a, b and c where a*x*x + b*x + c = 0\n");
	System.out.print("Enter value of a : ");
	int a= sc.nextInt();  
	System.out.print("Enter value of b : ");
	int b= sc.nextInt();  
	System.out.print("Enter value of c : ");
	int c= sc.nextInt();  
 	
	int d;
 	double root1, root2;
 	d = b*b - 4*a*c;

  	if (d < 0) 
	{ 
	
    		System.out.println("First root = " + -b/(double)(2*a) + " + " + "i"+ Math.sqrt(-d)/(2*a));
    		System.out.println("Second root = "+ -b/(double)(2*a) + " - " + "i" + Math.sqrt(-d)/(2*a));
  	}

 	else 
	{ 
    		root1 = (-b + Math.sqrt(d))/(2*a);
    		root2 = (-b - Math.sqrt(d))/(2*a);
 
    		System.out.println("First root = " + root1);
    		System.out.println("Second root = " + root2);
  	}
        
    }
}