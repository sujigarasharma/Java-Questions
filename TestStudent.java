import java.util.*;

class Student
{  
	
	int rollno;  
    	String name, programme;  
    	float cgpa;  
    	Student(int i, String n, String p, float s) 
	{  
        		rollno=i;  
        		name=n;
		programme=p;  
        		cgpa=s;  
    	}  
   	void display()
	{
		if(cgpa>8.0)
		{
			System.out.println("\nRoll Number : "+rollno+"\nStudent Name : "+name+"\nStudent programme : "+programme+"\nStudent cgpa : "+cgpa);
		}
	}  
	
}  
public class TestStudent {  
public static void main(String[] args) 
{  
	Scanner in =new Scanner(System.in);
	Scanner sc =new Scanner(System.in);
	Student[] s=new Student[7]; 
	
	for(int j=0 ;j<7;j++)
	{
		System.out.printf("\nEnter The Student %d Details\n",j+1);

		System.out.print("Enter The Student Roll Number : ");
		int srnum=in.nextInt();
		
		System.out.print("Enter The Student Name : ");
		String sname=sc.nextLine();

		System.out.print("Enter The Student programme : ");
		String sp=sc.nextLine();

		System.out.print("Enter The Student cgpa : ");
		float scgpa=in.nextFloat(); 

		s[j]=new Student(srnum, sname, sp, scgpa);  
		
	}
    	for(int j=0 ;j<7;j++)
	{
		s[j].display();
    	}
    }  
}  