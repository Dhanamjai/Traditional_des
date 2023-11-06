package arrs.objects;

import java.util.Scanner;

public class TraditionalDes {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		Des obj= new Des();
		
		System.out.println("enter the size of a array");
		obj.n=s.nextInt();
		obj.a=new int[obj.n];
		
		System.out.println("enter the elements of a array");
		for(int x=0;x<obj.n;x++)
		{
			obj.a[x]=s.nextInt();
		}
		
		int b[]=obj.model1(0);
		System.out.println(" sorted values are ");
		for(int x=0;x<obj.n;x++)
		{
			System.out.print(b[x]+" ");
		}
		for(int x=0;x<obj.n;x++)
		{
			System.out.print(b[x]+" ");
		}
	}
}


class Des
{
	int n;
	int a[];
	public int[] model1(int temp)
	{
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
				temp = a[x];
				a[x]=a[y];
				a[y]=temp;
				}
			}
		}
		return a;
	}
}