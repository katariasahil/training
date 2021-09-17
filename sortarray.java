/*package whatever //do not write package name here */

import java.io.*;

public class sortarray {
	public static void main (String[] args) {
	    
	    int[] arr = {5,10,3,2,6,4,8,1,7,9};
	    int l=0,r=arr.length,c=1;
	    
	    while(r>0)
	    {
	        l=0;
	        c=1;
	        while(c<r)
	        {
	            if(arr[l]>arr[c])
	            {
	               swap(arr,l,c);
	            }
	            l++;
	            c++;
	        }
	        r--;
	    }
	    for(int e:arr)
	    {
	 System.out.print(e+" ");   	        
	    }

	}
	public static void swap(int[] arr , int i , int j)
	{
	    int temp=0;
	    temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	 
	}
}
