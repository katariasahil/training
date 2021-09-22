/*package whatever //do not write package name here */

import java.io.*;

class tower {
	public static void main (String[] args) {
		
		int[] a = new int[10];
		a[0] = 1 ;
		a[1] = 2 ;
		int temp=0;
		for(int i=2;i<a.length;i++)
		{
		    temp=0;
		 for(int j=i-1;j>=0;j--)
		{
            		temp += a[j]*(j+1);		    
		}   
		a[i] = temp;
		}


		for(int i=0;i<a.length;i++)
		{
		          for(int k=0;k<a.length-i+2;k++)
		          System.out.print("-");
		            
		        for(int j=0;j<=i;j++)
		         System.out.print(a[i]+" ");
		         
		         System.out.println();
		}
		
		
	}
}
