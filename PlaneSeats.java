import java.util.Scanner;

class PlaneSeats
{
    public static void main(String args[]) 
	{
		char[][] seats = { { 'A', 'B', 'C', 'D' }, 
                           { 'A', 'B', 'C', 'D' }, 
                           { 'A', 'B', 'C', 'D' },
				           { 'A', 'B', 'C', 'D' },
                           { 'A', 'B', 'C', 'D' },
                           { 'A', 'B', 'C', 'D' }, 
                           { 'A', 'B', 'C', 'D' }, };
						   
		Scanner in = new Scanner(System.in);
		String proceed = "yes";
		
		while (proceed.equals("yes") ||proceed.equals("YES")&& !occupied(seats)) 
		{
			getDetails(seats);
			System.out.print("\nEnter a seat(For example 1A, 2B, or 4C): ");

			boolean inSeat = false;
			while (inSeat == false) 
			{
				String seat = in.nextLine();
				int r = rseat(seat);
				int c = cseat(seat);

				if (seats[r][c] == 'X')
		            System.out.print("\nSeat is occupied, Enter a different seat: ");
				else 
				{
					seats[r][c] = 'X';
					inSeat = true;
				}
			}
			System.out.print("\nWant to book more seats? (yes/no) :");
			proceed = in.nextLine();
		}

		System.out.println("\nPlane seating chart:");
		getDetails(seats);
	}
	
	public static boolean occupied(char[][] seats)
	{
		for (int i = 0; i < seats.length; i++) 
		{
			for (int j = 0; j < seats[0].length; j++) 
			{
				if (seats[i][j] != 'X')
					return false;
			}
		}
		return true;
	}

	public static int rseat(String numSeat) 
    {
		char row = numSeat.charAt(0);
		return (int) row - 48 - 1;
	}

	public static int cseat(String numSeat)
    {
		char column = numSeat.charAt(1);
		if (column == 'A')
			return 0;
		else if (column == 'B')
			return 1;
		else if (column == 'C')
			return 2;
		else if (column == 'D')
			return 3;
		else
			return -1;
	}

	public static void getDetails(char[][] seats) 
	{
		for (int i = 0; i < seats.length; i++) 
		{
			System.out.print((i + 1) + " ");
			
			for (int j = 0; j < seats[0].length; j++) 
			{
				System.out.print(seats[i][j] + " ");
		
				if (j == 1)
					System.out.print(" ");
			}

			System.out.println();
		}
	}


}