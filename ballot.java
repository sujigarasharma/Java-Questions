import java.util.*;  
public class ballot{

    public static void main(String[] args) {
  	
	Scanner sc= new Scanner(System.in);

	int count[]=new int[100];
	int voters, ballot, spoilt_ballots=0,c1=0,c2=0,c3=0,c4=0,c5=0;

	System.out.print("Enter The Number of Voters : ");
	voters = sc.nextInt();

	//Voting 
	System.out.println("ENTER YOUR VOTE (Vote Should be allowed a Numbers Only)\n");
	for(int j=0;j<voters;j++)
	{
		
		System.out.print("Voter " +(j+1) +" Enter your Vote : ");
 		ballot = sc.nextInt();
		count[j]= ballot;
	}

	//Counting a Vote
	for(int j=0;j<voters;j++)
	{
		if(count[j]==1)
		{
			c1++;
		}
		else if(count[j]==2)
		{
			c2++;
		}
		else if(count[j]==3)
		{
			c3++;
		}
		else if(count[j]==4)
		{
			c4++;
		}
		else if(count[j]==5)
		{
			c5++;
		}
		else 
		{
			spoilt_ballots++;
		}
		
	}
	
	//Counts
	System.out.println("\nNumber of ballots               = " + voters);
	System.out.println("\nNumber of spoilt ballots        = " + spoilt_ballots);
	System.out.println("\nNumber of Fresh  ballots        = " + (voters - spoilt_ballots));
	System.out.println("\nNumber of Votes for candidate 1 = " + c1);
	System.out.println("\nNumber of Votes for candidate 2 = " + c2);
	System.out.println("\nNumber of Votes for candidate 3 = " + c3);
	System.out.println("\nNumber of Votes for candidate 4 = " + c4);
	System.out.println("\nNumber of Votes for candidate 5 = " + c5+"\n");

    }
}