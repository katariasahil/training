/*package whatever //do not write package name here */

import java.io.*;

public class getfirstindexofarray {
	public static void main (String[] args) {
	    
	    int[] arr = {5,10,5,6,4,8,7,9};
	    int positionof = 5;
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
	    
	    int left = 0 , right = arr.length-1 , mid;
	    
	    int result =-1;
	    
	    while(left<right)
	    {
	        mid = (left + right)/2;
	        if(positionof == arr[mid])
	        {
	            result = mid;
	            break;
	        }
	        else if(arr[mid]<positionof)
	        {
	            left = mid+1;
	        }
	        else{
	            right = mid-1;
	        }
	    }
	    while(result >=0 && arr[result-1] == positionof)
	    {
	        result--;
	    }
	    
	 System.out.print(result);   	        
	    

	}
	public static void swap(int[] arr , int i , int j)
	{
	    int temp=0;
	    temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	 
	}
}
