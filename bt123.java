package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt123 {
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] a=new int[1000];
	for (int i=0;i<n;i++)
		a[i]=sc.nextInt();
	int min=0;
	for (int i=1;i<n;i++)
	{
		if (a[min]<a[i])
			min=i;
	}
	System.out.print(a[min] + " " + min);
}
}
