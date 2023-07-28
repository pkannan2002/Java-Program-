import java.util.*;
import java.io.*;
class searching
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		String word=s.next();
		int found=0,pos=0;
		String words[]=new String[size];
		for(int i=0;i<size;i++)
		{
			words[i]=s.next();
		}
		for(int i=0;i<size;i++)
		{
			if(words[i].equals(word))
			{
				found=1;
				pos=i+1;
				break;
			}
		}
		if(found==1)
		{
			System.out.print("it is found in the pos:"+ pos);
		}
		else 
		{
			System.out.print("the word is not found");
		}
	}
}

		
	