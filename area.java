import java.util.*;  

public class area{

    public static void main(String[] args) {
        
	Scanner sc= new Scanner(System.in); 	
	
	
	System.out.print("Press 1 to calculate area and circumference of Circle\n");
	System.out.print("Press 2 to calculate area and circumference of Square \n"); 
	System.out.print("Press 3 to calculate area and circumference of Rectangle \n");
	System.out.print("Press 4 to calculate area and circumference of Triangle \n"); 
	System.out.print("Press 5 to Exit \n"); 
	while(true)
	{
	  System.out.print("\n\nEnter Your Choice : ");
	  int choice=sc.nextInt();
	
	  switch (choice)
	  {
		case 1 :
			System.out.print("Enter Radius of Cycle : "); 
			double r =sc.nextInt();
			double a = 22.0*r*r/7.0;
			double c = 2*r*22.0/7.0;
			System.out.println("Area of circle = " + a);
			System.out.println("Circumference of circle = " + c);
			break; 
		case 2 :
			System.out.print("Enter length of Square : "); 
			double n =sc.nextInt();
			a = n*n;
			c = 4*n;
			System.out.println("Area of Square = " + a);
			System.out.println("Circumference of Square = " + c);
			break; 
		case 3 :
			System.out.print("Enter length of Rectangle : "); 
			double l =sc.nextInt();
			System.out.print("Enter breath of Rectangle : "); 
			double b =sc.nextInt();
			a = l*b;
			c = 2*(l+b);
			System.out.println("Area of Rectangle = " + a);
			System.out.println("Circumference of Rectangle = " + c);
			break; 
		case 4 :
			System.out.print("Enter length 1 of Triangle : "); 
			double l1 =sc.nextInt();
			System.out.print("Enter length 2 of Triangle : "); 
			double l2 =sc.nextInt();
			System.out.print("Enter breath 3 of Triangle : "); 
			double l3 =sc.nextInt();
			System.out.print("Enter Height of Triangle : "); 
			double h =sc.nextInt();
			a = (l1*h)/2;
			c = l1+l2+l3;
			System.out.println("Area of Triangle = " + a);
			System.out.println("Circumference of Triangle = " + c);
			break; 
		case 5 :
			return;
		
		default  :
			System.out.println("Invalid Choice");
	   }
	}	

   }
}

 
