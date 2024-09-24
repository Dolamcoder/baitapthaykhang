package BAITAPTHAYKHANG;
import java.util.Scanner;
public class bt139 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int [] a=new int [1000];
	for (int i=0;i<n;i++)
		a[i]=sc.nextInt();
	System.out.print(timkiem(a, n));
     if (check(28)) System.out.print("T");
     else System.out.println("F");
	}
public static boolean check(int n)
{
	int temp=n;
	int s=0;
	for (int i=1;i<=n/2;i++)
	{
		if (n % i==0)
			s+=i;
	}
	if (s==temp) return true;
	else return false;
}
public static int timkiem(int a[], int n)
{
	for (int i=n-1;i>=0;i--)
	{  
		if (check(a[i])) return a[i];	
	}
	return -1;
	
}
}
