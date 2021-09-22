/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class alterMatrix {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] mat = new int[a][b];
		int count=1;
		for(int i=0;i<a;i++)
		{
		    if(i%2==0)
		    {
		        for(int j=0;j<b;j++)
		        {
		            mat[i][j] = count;
		             count++;
		        }
		    }
		    else{
		        for(int j=b-1;j>=0;j--)
		        {
		            mat[i][j] = count;
		             count++;
		        }
		    }
		   
		    
		}
		
		for(int i=0;i<a;i++)
		{
		 		for(int j=0;j<b;j++)
		{
		    System.out.print(mat[i][j]+" ");
		}   
		System.out.println();
		}
	}
}
