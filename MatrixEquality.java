/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class MatrixEquality{
	public static void main (String[] args) {
		
		
		int[][] a = {{1,12,5},{3,-2,6}};
	    int[][] b = {{1,2,2},{3,-2,5}};
        int[][] result = new int[2][3];
		for(int i=0;i<2;i++)
		{
            for(int j=0;j<3;j++)
		    {
		        if(a[i][j]!=b[i][j])
		result[i][j] = a[i][j];
		    }		
		}
		
		for(int i=0;i<2;i++)
		{
		 		for(int j=0;j<3;j++)
		{
		    System.out.print(result[i][j]+" ");
		}   
		System.out.println();
		}
	}
}
