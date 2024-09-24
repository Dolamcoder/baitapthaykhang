package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt136 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] a=new int [1000];
		int n;
		n=sc.nextInt();
		for (int i=0;i<n;i++)
			a[i]=sc.nextInt();
	System.out.print(xuly(a, n));
	}
	public static int xuly(int a[], int n)
	{
		for (int i=n-1;i>=0;i--)
			{
			if (a[i] % 2==0) return a[i];
			}
		return -1;
	}

}
