import java.util.*;
class Student
{  
	void Student()
	{
		System.out.println("\nDetails of Departments");
	}  
}  
class Arts extends Student
{ 
	Scanner in =new Scanner(System.in);
	int total_num_years()
	{
		System.out.print("\nEnter The Total Number Of Years for Arts Students : ");
		int tns=in.nextInt();
		return tns;
	}  
	int total_num_credits()
	{
		System.out.print("Enter The Total Number Of Credits for Arts Students : ");
		int tnc=in.nextInt();
		return tnc;
	}
	
}  
  
class Engineering extends Student
{  
	Scanner in =new Scanner(System.in);
	int total_num_years()
	{
		System.out.print("\nEnter The Total Number Of Years for Engineering Students : ");
		int tns=in.nextInt();
		return tns;
		
	}  
	int total_num_credits()
	{
		System.out.print("Enter The Total Number Of Credits for Engineering Students : ");
		int tnc=in.nextInt();
		return tnc;
	}
	
}  
class Medical extends Student
{  
	Scanner in =new Scanner(System.in);
	int total_num_years()
	{
		System.out.print("\nEnter The Total Number Of Years for Medical Students : ");
		int tns=in.nextInt();
		return tns;
		
	}  
	int total_num_credits()
	{
		System.out.print("Enter The Total Number Of Credits for Medical Students  : ");
		int tnc=in.nextInt();
		return tnc;
	}
	
}  
class college
{  
	public static void main(String args[])
	{  
		Student S=new Student();
		Arts A=new Arts();  
		Engineering E=new Engineering();  
		Medical M=new Medical(); 
		
		S.Student();
		int a1= A.total_num_years();
		int a2= A.total_num_credits();
		int e1= E.total_num_years();
		int e2= E.total_num_credits(); 
		int m1= M.total_num_years();
		int m2= M.total_num_credits();  
		System.out.println("\n------ARTS STUDENTS------");  
		
		System.out.println("Total Number of Years : "+a1);  
		System.out.println("Total Number of Credits : "+a2);  

		System.out.println("\n------Engineering STUDENTS------");  

		System.out.println("Total Number of Years : "+e1); 
		System.out.println("Total Number of Credits : "+e2); 

		System.out.println("\n------Medical STUDENTS------");  
 
		System.out.println("Total Number of Years : "+m1);  
		System.out.println("Total Number of Credits : "+m2);  
	}  
}  
