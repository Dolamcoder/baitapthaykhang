package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt169 {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int [] a= new int [1000];
         int n=sc.nextInt();
         for (int i=0;i<n;i++)
         {
        	 a[i]=sc.nextInt();
         }
         System.out.println(xuLy(a, n));
	}
	public static int xuLy(int a[], int n)
	{
		int max=a[0];
		for (int i=1;i<n;i++)
		{
			if (max<a[i])
				max=a[i];
		}
		if (max % 2==0) return max;
		else return max+1;
	}

}
