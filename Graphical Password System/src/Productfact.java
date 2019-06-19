import java.io.*;
import java.util.*;
public class Productfact {
	public static void main(String a[])
	{
		int N,K,j;
		Scanner i=new Scanner(System.in);
		N=i.nextInt();
		K=i.nextInt();
		String n;
		
		int p[];
		p=new int[100];
		int fact[];
		fact=new int[100];
		
		System.out.println("N="+N+"K="+K);
		for(j=0;j<N;j++)
		{
			
			System.out.println("enter the series of int");
			p[j]=i.nextInt();
			
			}
		
		int product=1;
		for(j=0;j<N;j++)
		{
			
			
			 product*=p[j];
			
			}
		System.out.println("product is"+product);
		System.out.println("fact of that no");
		fact[0]=0;
		for(int f=1;f<=product;f++)
		{
			if(product%f==0)
			{
				fact[f]=f;
			}
		}
		
		System.out.println("fact of that no"+fact);
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
}
