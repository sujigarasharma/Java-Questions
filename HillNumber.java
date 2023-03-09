import java.util.*;  
import java.lang.Math;

public class HillNumber{

    	public static void main(String[] args) {
  	Scanner sc= new Scanner(System.in);
	long num;
	int rem;
	int count = 0,j=0;
	int d[],temp; 
	d=new int[20];
	System.out.print("Enter the Number  : "); 
	long lnum = sc.nextLong();
	num = lnum;  
	//System.out.println(num); 
	while (num != 0) 
	{
		rem=(int)num%10;
      		num = num/10;
		d[j]=rem;
		j++;
      		count++;
    	}
	temp= count;
	int a= d[temp-1];
	int b= d[temp-3];
	int p= d[temp-2];
	int u=0;
	
	if(temp==3)
	{
		if(p>a&p>b)
		{
			System.out.printf("%d is a Hill Number\n", lnum); 
		}
		else
		{
			
			System.out.printf("%d is Not a Hill Number\n", lnum); 
	
		}
	}
	else{
	while(temp!=3)
	{
		
		
		//System.out.println(a); 
		//System.out.println(b); 
		//System.out.println(p); 
		if(p>a&p>b)
		{
			a= b;
			temp=temp-2;
			b= d[temp-3];
			p= d[temp-2];
		}
		else
		{
			
			System.out.printf("%d is Not a Hill Number\n", lnum); 
			u++;
			break;
	
		}
		
	}
	if(u==0)
	{
		System.out.printf("%d is a Hill Number\n", lnum); 
	}
	
	
	}

    }
}
