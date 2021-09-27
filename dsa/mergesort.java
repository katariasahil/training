package dsa;
import java.util.*;
public class mergesort {
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
int itr = 0;

while(itr<n)
a[itr++] = sc.nextInt();

Sort(a,0,a.length-1);
//System.out.println("mergesort");
for(int e:a)
	System.out.print(e+" ");
}
static void Sort(int[] a, int  l , int r)
{
	if(l<r)
	{
		int m = (l+r)/2;
		Sort(a,l,m);
		Sort(a,m+1,r);
		merge(a,l,m,r);
	}

	}

static void merge(int[] a, int  l , int m, int r)
{
	int n1 = m-l+1;
	int n2 = r-m;
	int[] a1 = new int[n1]; 
	int[] a2 = new int[n2]; 
	
	for(int i=0;i<n1;i++)
	a1[i] = a[i+l];
	
	for(int j=0;j<n2;j++)
	a2[j] = a[j+m+1];
	
	int k=l;
	int i = 0,j=0;
	
	while(i<n1 && j<n2)
	{
		if(a1[i]>=a2[j])
			a[k] = a2[j++];
		else if(a1[i]<a2[j])
			a[k] = a1[i++];
					k++;
		
	}
	while(i<n1)
		a[k++] = a1[i++];
	while(j<n2)
		a[k++] = a2[j++];
	
	}
}
