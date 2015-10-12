import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class GridSearch {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int T,R,C,r,c;
        T=Integer.parseInt(scan.nextLine());
        for(int k=0;k<T;k++)
            {
                String[] dimensions=(scan.nextLine().split(" "));
                int[] rows=toInt(dimensions);
                //System.out.println(rows[0]);
                String[] Grid=new String[rows[0]];
                for(int i=0;i<rows[0];i++)
                    {
                        Grid[i]=scan.nextLine();
                    }
                dimensions=(scan.nextLine().split(" "));
                rows=toInt(dimensions);
                String[] pattern=new String[rows[0]];
                for(int i=0;i<rows[0];i++)
                    {
                        pattern[i]=scan.nextLine();
                    }
                int match=0,start=0,end=0;
                //Pattern q=Pattern.compile(pattern[match]);
                //Matcher n=q.matcher(Grid[0]);
                //if(n.find())
                	/*{
                		match++;
                		start=n.start();
                		end=n.end();
                	}
               // System.out.println(start+"\t"+end);
                */
                for(int i=0;i<Grid.length;i++)
                    {
                        Pattern p = Pattern.compile(pattern[match]);
                        Matcher m = p.matcher(Grid[i]);
                        if(m.find(start))
                        		{
                        			start=m.start();
                        			if(end==0)
                        				end=m.end();
                        			System.out.println(m.start()+"\t"+m.end());
                        			if(m.end()==end)
                        			{
                        				match++;
                        				//start=m.start();
                        				end=m.end();
                        			}
                        			else
                        			{match=0; start=0;end=0;}	
                        		}
                        		else
                        			{match=0; start=0;end=0;}
                                                       
                        if(match==pattern.length)
                            {
                                break;
                            }
                    }
	
                if(match==pattern.length)
                    System.out.println("YES");
                else
                    System.out.println("NO");
        }
    }

public static int[] toInt(String[] str)
{
	int[] number=new int[str.length];
	for(int i=0;i<str.length;i++)
	{
		number[i]=Integer.parseInt(str[i]);
	}
	return number;
}
}
