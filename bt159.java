package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt159 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] a=new double [1000];
        int n=sc.nextInt();
        for (int i=0;i<n;i++)
        	a[i]=sc.nextDouble();
       System.out.print(xuLy(a, n));
	}
public static double xuLy(double a[], int n)
{
	for (int i=0;i<n;i++)
	{
		if (a[i]>2003)
			return a[i];
	}
	return -1;
}
}
