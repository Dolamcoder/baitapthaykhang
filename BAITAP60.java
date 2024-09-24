package BAITAPTHAYKHANG;
import java.util.*;
public class BAITAP60 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n;
	n=sc.nextInt();
	int cnt=demphantu(n);
	int[] a= new int [1000];
	int t=0;
	while (n!=0)
	{ 
		int x=(int)Math.pow(10, cnt-1);
		a[t]=n/x;
		t++;
		cnt--;
		n= n % x;
	}
	if (check(a, t)) System.out.print("yes");
	else System.out.println("No");
	
}
public static int demphantu(int n)
{
	int dem=0;
	while (n !=0)
	{
		n/=10;
		dem++;
	}
	return dem;
}
public static boolean check(int a[], int n)
{
	for (int i=0;i<n;i++)
	{
		for (int j=i+1;j<n;j++)
		{	if (a[i]<a[j]) 
			{
			return false;
			}
		}
	}
	return true;
}
}


