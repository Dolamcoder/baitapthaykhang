package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt162 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double[] a=new double[1000];
	int n;
	n=sc.nextInt();
	for (int i=0;i<n;i++)
		a[i]=sc.nextDouble();
	System.out.print(xuLy(a, n));
	}
public static int xuLy(double a[], int n)
{
	for (int i=1;i<n-1;i++)
	{
		if (a[i]==a[i+1]*a[i-1]) return i;
	}
	return -1;
}
}
