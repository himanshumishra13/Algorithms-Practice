import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeasarCode {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int N,K;
		String S;
		N=scan.nextInt();
		S = scan.next();
		if(S.length()!=N)
			{
				System.out.println("Wrong Input");
				S = scan.next();
			}
		K=scan.nextInt();
		S=rotate(S,K);
		System.out.println(S);
	}
	
	public static String rotate(String toRotate,int noOfTimes) {
		String temp=toRotate;
		temp=temp.toLowerCase();
		System.out.println("Initially "+temp);
		char[] strArray=temp.toCharArray();
		int K;
		if(noOfTimes%26!=0)
			K=noOfTimes%26;
		else 
			K=noOfTimes;
		for(int i=0;i<temp.length();i++)
		{
			
			if((int)strArray[i]>=97 && (int)strArray[i]<=122)
				if((int)strArray[i]+K > 122)
					strArray[i]=(char)(97+((int)strArray[i]+K-122)-1);
				else
					strArray[i]+=K;
			if((int)toRotate.charAt(i)>=65 && (int)toRotate.charAt(i)<=90)
					strArray[i]=(char)(65+((int)strArray[i]-97));
		}
		temp=new String(strArray);
		System.out.println("Finally "+temp);
		return temp;
	}
	
}


