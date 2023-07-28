import java.util.*;
import java.io.*;
class tax
{
	public static int calculation(int size)
	{
		Scanner s=new Scanner(System.in);
		int arr[]=new int[size];
		int result=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			result+=(arr[i]-1000)*10/100;
		}
		return result;
	}
			

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int result=calculation(size);
		System.out.print("The total tax is:"+result);
	}
}



