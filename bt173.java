package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt173 {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] a=new int [1000];
      for (int i=0;i<n;i++)
      {
    	  a[i]=sc.nextInt();
      }
      int [] b=new int [1000];
  	  int t=0;
      taomang(a, n, b, t);
      xuatmang(b, t);
	}
	public static void taomang(int a[], int n, int b[], int t)
	{
		b[t]=a[0];
		t++;
		for (int i=1;i<n;i++)
		{
			for (int j=i-1;j>=0;j--)
			{
				if (a[i]!=a[j])
					{
					b[t]=a[i];
				    t++;
					}
			}
		}
	}
	public static void xuatmang(int a[], int n)
	{
		for (int i=0;i<=n;i++)
			System.out.print(a[i]+" ");
	}

}
