import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

	 public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int N;
	        N=scan.nextInt();
	        String arry[]=new String[N];
	        char arr[][]=new char[N][N];
	        for(int i=0;i<N;i++)
	            {
	                arry[i]=scan.next();
	                for(int j=0;j<N;j++)
	                       {
	                            arr[i][j]=arry[i].charAt(j);
	                       }
	            }
	        for(int i=0;i<N;i++)
	            {
	                for(int j=1;j<N-1;j++)
	                    {
	                        if(((int)(arr[i][j-1])<(int)(arr[i][j])) && (((int)arr[i][j+1])<((int)arr[i][j])))
	                        {   
	                            arr[i][j]='X';
	                        }
	                    }
	            }
	        for(int i=0;i<N;i++)
	            {
	                for(int j=0;j<N;j++)
	                    {
	                        System.out.print(arr[i][j]);
	                    }
	                System.out.println();
	            }
	    }
	}