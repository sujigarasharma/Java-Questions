
import java.util.Scanner;

class MergeSortedArr
{
	public static void mergeArrays(int[] A, int[] B, int Aelements,int Belements, int[] C)
	{
		int i = 0, j = 0, k = 0;
	
		while (i<Aelements && j <Belements)
		{
			if (A[i] < B[j])
				C[k++] = A[i++];
			else
				C[k++] = B[j++];
		}
	
		while (i < Aelements)
			C[k++] = A[i++];
	
		while (j < Belements)
			C[k++] = B[j++];
	}
	
	public static void main (String[] args)
	{
		int A[]=new int[5];
		int B[]=new int[5];
		Scanner in= new Scanner(System.in);
		
		System.out.print("\nEnter The Number of elements of first Array : ");
		int Anum = in.nextInt();
	
		System.out.print("\nEnter first array elements: ");
		for(int j=0;j<Anum;j++)
		{
			System.out.print("\nEnter the " + (j+1) + " element of first array : ");
			A[j] = in.nextInt();
		}
		
		
			
		System.out.print("\nEnter The Number of elements of Second Array : ");
		int Bnum = in.nextInt();

		System.out.print("\nEnter Second array elements: ");
		for(int j=0;j<Bnum;j++)
		{
			System.out.print("\nEnter the " + (j+1) + " element of Second array : ");
			B[j] = in.nextInt();
		}
		
		
	
	    int[] C = new int[Anum + Bnum];
		
		mergeArrays(A, B, Anum, Bnum, C);
	
		System.out.println("\nArray after merging both arrays: ");
		for (int i=0; i < Anum + Bnum; i++)
		{
			System.out.print(C[i] + " ");
		}
	}
}


