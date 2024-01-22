import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner s =new Scanner (System.in);
        int test=s.nextInt();
        boolean process=true;
        for(int i=0;i<test;i++)
        {
            int days=s.nextInt();
            int gram=s.nextInt();
            int d[]=new int [days];
            for (int j=0;j<days;j++)
            {
                d[j]=s.nextInt();
            }
            int temp=0,count=0;
            for (int j=0;j<days ;j++)
            {   
                 d[j]+=temp;
                
                 if(d[j]>=gram)
                {
                    count++;
                    temp=d[j]-gram;
                }
                else {
                    System.out.println("NO"+" "+(j+1));
                    break;
                }
                
            }
            if(count==days)
            {
                System.out.println("YES");
            }
        }
	}
}