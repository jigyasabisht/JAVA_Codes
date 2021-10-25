/*

*********
 *******
  *****
   ***
    *
    
 */

import java.util.*;
public class StarPattern8
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for (int i=n; i>=1; i--)
        {
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
            // Print space in increasing order 
            for (int j=n; j>=i; j--)
            {
                System.out.print(" ");
            }
	    }
		
	}
}
