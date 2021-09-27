package dsa;

public class bubblesort {

	public static void main(String args[])
	{
	int[] a = {4,8,6,1,3,9,5,-2};
	 a = bubbleSort(a);
	for(int e:a)
		System.out.print(e+" ");
	}
	static int[] bubbleSort(int[] a)
	{
		int min;
		           boolean flag = false;
		int left = 0,right = 1;
		while(!flag)
		{
            flag = true;
            left = 0; 
            right = 1;
			while(right<a.length)
			{
				if(a[left]>a[right])
				{
					flag = false;
					a = swap(a,left , right);
				}
				left++;
				right++;
				
			}
		}

		
		return a;
	}
	static int[] swap(int[] a , int left , int right)
	{
		int temp = a[left];
		a[left] = a[right];
a[right] = temp;
return a;
	}
	}
