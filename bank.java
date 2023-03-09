import java.util.*;  
public class bank{

    public static void main(String[] args) {
  	
	Scanner sc= new Scanner(System.in);
	int j=1;
	String acc_num,toa,name;
	Float bal;

	//To assign initial values
	System.out.print("Enter The Name : ");
	name = sc.nextLine();

	System.out.print("Enter The ACC Number : ");
	acc_num = sc.nextLine();
	
	System.out.print("Enter The Type of Account : ");
	toa = sc.nextLine();

	System.out.print("Enter The Balance Amount : ");
	bal = sc.nextFloat();
	
	while(j>=1)
	{
		System.out.println("\nEnter The PRESS 1 for deposit an amount ");
		System.out.println("Enter The PRESS 2 for  checking balance and withdraw an amount ");
		System.out.println("Enter The PRESS 3 for display the name and balance ");
		System.out.println("Enter The PRESS 4 Exit ");

		System.out.print("Enter your Choice : ");
		int ch = sc.nextInt();
	
		switch(ch)
		{
			//To deposit an amount in the given account
			case 1:
				System.out.print("\nEnter The amount for deposit : ");
				Float dep = sc.nextFloat();
				bal = bal+ dep;
			break;

			//checking balance and withdraw an amount
			case 2:
				System.out.println("\nAvailable balance is : " + bal);
				System.out.print("\nEnter The amount for withdrawal  : ");
				Float with = sc.nextFloat();
				bal = bal- with;
			break;
		
			//display the name and balance
			case 3:
				System.out.println("\nName  : " + name);
				System.out.println("Available balance is : " + bal);
			
			break;
			case 4:
				System.exit(0);
			
			break;

		}
	}
	
	

    }
}