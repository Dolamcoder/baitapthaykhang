package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt135 {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int[] a=new int[1000];
	  int n=sc.nextInt();
      for (int i=0; i<n;i++)
    	  a[i]=sc.nextInt();  
      System.out.println(xuly(a, n));
	}
	public static int xuly(int a[], int n)
	{
		for (int i=0;i<n;i++)
		{
			if (a[i]>0) return a[i];
		}
		return -1;
	}
}
