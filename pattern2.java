import java.lang.Math; 
import java.util.*;  

public class pattern2{

    public static void main(String[] args) {

        
	Scanner sc= new Scanner(System.in); 	
	System.out.print("Enter The range of series : ");  
	int n= sc.nextInt();  
	int t1=0,t2=0;

        for (int i = 0; i <= n; i++)
        {
		
		t1 = 7 * (int) Math.pow(10, i)+t1;
		t2 = 9 * (int) Math.pow(10, i)+t2;
		
		System.out.print(t1 + "x" + t2 + " = ");
		
		int ans = t1*t2;
		System.out.print(ans + "\n");
        }
    }
}