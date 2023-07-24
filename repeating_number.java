import java.util.*;
import java.io.*;
class rep
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size-1;i++)
		{
			if (arr[i]==arr[i+1])
			{
				System.out.print(arr[i]+" ");
				
			}
		}
		int missing=arr[0];
		System.out.print(missing-1);
	}
}