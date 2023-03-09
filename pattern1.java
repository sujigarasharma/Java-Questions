import java.lang.Math; 
import java.util.*;  

public class pattern1 {

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("Enter The range of series : ");  
	int n= sc.nextInt();  
	long temp = 1;

        for (int i = 0; i <= n; i++)
        {
		
		temp = 3 * (long) Math.pow(10, i) + temp;
		System.out.print(temp +"^" + "2" + " = ");
		
		long ans = temp*temp;
		System.out.print(ans + "\n");
        }
    }
}