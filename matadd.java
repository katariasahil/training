/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class matadd{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] a = {{1,2,2},{3,-2,5}};
	    int[][] b = {{4,3,0},{7,5,1}};
        int[][] result = new int[2][3];
		for(int i=0;i<2;i++)
		{
            for(int j=0;j<3;j++)
		    {
		result [i][j] = a[i][j]+b[i][j];
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
