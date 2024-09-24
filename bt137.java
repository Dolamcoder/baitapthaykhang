package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt137 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int[] a=new int[1000];
	  int n=sc.nextInt();
	  for (int i=0;i<n;i++)
		  a[i]=sc.nextInt();
	  System.out.println(timmin(a, n));
	}
	public static int timmin(int a[], int n)
	{
		int min=0;
		for (int i=1;i<n;i++)
		{
			if (a[min]>a[i])
				min=i;
		}
		return min;
	}

}
