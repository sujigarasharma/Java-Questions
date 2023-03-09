import java.lang.Math; 
import java.util.*;  

public class pattern3{

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("Enter The range of series : ");  
	int n= sc.nextInt();  
	int temp=99,j=3;

        for (int i = 1; i <= n; i++)
        {
		
		temp=(temp-(int)Math.pow(10, i)) + (int)Math.pow(10, j);
		j++;
		
		
		System.out.print(temp + "x" + "9" + " = ");
		
		int ans = temp*9;;
		System.out.print(ans + "\n");
        }
    }
}