import java.lang.Math; 
import java.util.*;  

public class pattern4{

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("Enter The range of series : ");  
	int n= sc.nextInt();  
	int temp=198,j=3;

        for (int i = 1; i <= n; i++)
        {
		
		temp=(temp-2*(int)Math.pow(10, i)) + 2*(int)Math.pow(10, j);
		j++;
		
		System.out.print(temp + "x" + "4" + " = ");
		
		int ans = temp*4;
		System.out.print(ans + "\n");
        }
    }
}