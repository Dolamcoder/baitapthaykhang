package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt171 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[1000];
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print(xuLy(a, n));
	}
	public static int ucln(int a, int  b)
	{
		if(a>b)
		{
			a=a-b;
		}
		else if (a<b)
		{
			b=b-a;
		}
		return a;
	}
	public static int xuLy(int a[], int n)
	{
		int max=ucln(a[0],a[1]);
		for (int i=2;i<n;i++)
		{
			max=ucln(max, a[i]);
		}
		return max;
	}
}
