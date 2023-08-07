import java.util.*;
class color
{
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		char[] arr=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.next().charAt(0);
		}
		boolean val=false;
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if (arr[i] == arr[j])
				{
					count++;
				}
			}
			if(count%2!=0)
			{
				System.out.println(arr[i]);
				val=true;
				break;
			}
		}
		if (val==false)
		{
			System.out.println("all the colors are even ");
		}
	}
}