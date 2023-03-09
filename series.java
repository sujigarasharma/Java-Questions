import java.lang.Math; 
import java.util.*;  

public class series {

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter The Number : ");  
	int p= sc.nextInt();  	
	System.out.print("Enter The range of series : ");  
	int n= sc.nextInt();  
	int temp = 0;

        for (int i = 0; i <= n; i++)
        {
		
		int ans = (int)Math.pow(p, i);
		temp=temp+ans;
	
		System.out.print(temp + " , ");
        }
    }
}