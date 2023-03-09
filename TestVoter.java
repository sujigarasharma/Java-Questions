import java.util.*;

class Voter
{  
	
	int id, Age;
    	String name, place,fname;  
    	
    	Voter(int i, String n, String fn,int a, String p) 
	{  
        		id=i;  
        		name=n;
		fname=fn;
		Age=a; 
		place=p;  
        		
    	}  
   	void display()
	{
		if(Age>18)
		{
			System.out.println("\nID : "+id+"\nVoter Name : "+name+"\nFather Name : "+fname+"\nAge : "+Age+"\nPlace : "+place);
		}
	}  
	
}  
public class TestVoter {  
public static void main(String[] args) 
{  
	Scanner in =new Scanner(System.in);
	Scanner sc =new Scanner(System.in);
	Voter[] V=new Voter[5]; 
	
	for(int j=0 ;j<2;j++)
	{
		System.out.printf("\nEnter The Voter %d Details\n",j+1);

		System.out.print("Enter The  ID : ");
		int vid=in.nextInt();
		
		System.out.print("Enter The Name : ");
		String vname=sc.nextLine();

		System.out.print("Enter The father Name : ");
		String vfname=sc.nextLine();
		
		System.out.print("Enter The Age : ");
		int vAge=in.nextInt(); 

		System.out.print("Enter The place : ");
		String vp=sc.nextLine();

		

		V[j]=new Voter(vid, vname, vfname, vAge, vp);  
		
	}
	System.out.println("\nEligible voter details");
    	for(int j=0 ;j<2;j++)
	{
		V[j].display();
    	}
    }  
}  