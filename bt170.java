package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt170 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int [1000];
	for (int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.print(xuLy(timmax(a, n)));
	}
	public static int  timmax(int a[], int n)
	{
		int max=a[0];
		for (int i=1;i<n;i++)
		{
			if (max<a[i])
				max=a[i];
		}
		return max;
	}
	public static int xuLy(int n)
	{
		
		for (int i=0;i<Math.pow(2, 31);i++)
		{
			if (check(n+i)==true) 
			return n+i;
		}
		return 0;
	}
	public static boolean check(int n)
	{
		if (n<2) return false;
		else {
			for (int i=2;i<=Math.sqrt(n);i++)
			{
				if (n % i==0) return false ;
			}
			return true;
		}
	}
	
}
