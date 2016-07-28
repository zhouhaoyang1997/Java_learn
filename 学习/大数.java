 package Ñ§Ï°;
import java.math.BigInteger;  
import java.util.*;  
  
public class ´óÊý 
{  
    public static void main(String args[])  
    {  
        Scanner in = new Scanner(System.in); 
        BigInteger aa[] = new BigInteger[100];   
        int n = in.nextInt();         
        for(int i = 1; i <= n; ++i)  
        {  
            BigInteger a = in.nextBigInteger();  
            BigInteger b = in.nextBigInteger();  
            BigInteger ans = a.add(b);  
            aa[i] = ans; 
        }  
        for(int i=1; i <= n; ++i)
        {
        	System.out.print(aa[i]+"\n");
        }
    }  
}  