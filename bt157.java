package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt157 {
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	double  [] a=new double  [1000];
	for (int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.println("doan chua tat ca cac phan tu mang la [" + timmin(a, n)+";"+ timmax(a, n)+"]");
}
public static double  timmin(double  a[], int n)
{
	double  min=a[0];
	for (int i=1;i<n;i++)
	{
		if (min >a[i])
			min=a[i];
	}
	return min;
}
public static double timmax(double a[], int n)
{
	double max=a[0];
	for (int i=1;i<n;i++)
	{
		if (max < a[i])
			max= a[i];
	}
	return max;
}
}
