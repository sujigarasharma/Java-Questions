import java.util.Scanner;

public class PizzaPrice
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int j=0, ct=0, pt=0, ht=0;
		
	  while(j!=1)
	  {

		System.out.println("\nPRESS 1 FOR LARGE PIZZA");
		System.out.println("PRESS 2 FOR SMALL PIZZA");
		System.out.println("PRESS 3 FOR MEDIUM PIZZA");
		System.out.println("PRESS 4 FOR EXIT");
		System.out.print("\nEnter Your Choice : ");
		int ch = sc.nextInt();
		
		if(ch<=3){
		  System.out.println("\nEnter the number of toppings (Ex : 1,2,3)");
		  System.out.print("\nEnter the number of cheese toppings    : ");
		  ct = sc.nextInt();
		  System.out.print("Enter the number of pepperoni toppings : ");
		  pt = sc.nextInt();
		  System.out.print("Enter he number of ham toppings        : ");
		  ht = sc.nextInt();
		}

		switch (ch)
		{
			case 1 : 
				
				Pizza p1 = new Pizza("large", ct, pt, ht);
				System.out.println(p1.getDescription());
				break;

			case 2 :
				Pizza p2 = new Pizza("small", ct, pt, ht);
				System.out.println(p2.getDescription());
				break;

			case 3 :
				Pizza p3 = new Pizza("medium", ct, pt, ht);
				System.out.println(p3.getDescription());
				break;
			case 4 :
				System.out.println("\nTHANK YOU");
				j++;
				System.exit(0);

			default:
				System.out.println("\nInvalid Input Try Again");
				
		}
	    }
	}
}
class Pizza  
{
	private String pizzaSize;
	private int cheeseCount;
	private int pepperoniCount;
	private int hamCount;

	
	
	public Pizza(String pz, int cc, int pc, int hc)
	{
		pizzaSize = pz;
		cheeseCount = cc;
		pepperoniCount = pc;
		hamCount = hc;
	}
	
	public double calcCost()
	{		
		if(pizzaSize.equalsIgnoreCase("small"))
		{
			return 10 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("medium"))
		{
			return 12 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else if(pizzaSize.equalsIgnoreCase("large"))
		{
			return 14 + (cheeseCount + pepperoniCount + hamCount) * 2;
		}
		else
		{
			return 0.0;
		}
	}

	public String getDescription()
	{
		return "\nCOST Of PIZZA" + "\n\n Pizza size         : " + pizzaSize + "\n Cheese toppings    : " + cheeseCount + 
		"\n Pepperoni toppings : "+ pepperoniCount + "\n Ham toppings       : " + hamCount + "\n\n Pizza cost         : $" + calcCost() + "\n";
	}
}

