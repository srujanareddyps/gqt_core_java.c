/**
 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;
/* - - - $
 * - - $ $ $
 * - $ $ $ $ $
 */

/**
  * @author Srujana
  * @category patterns
  * @description This is an example for pyramid pattern 
 */
public class NewPattern3 {

	/**
	 * @param args
	 * @ description This contains source code for the pattern
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.print("Enter the size: ");
	       int  n=sc.nextInt();
	       for(int i=1;i<=n;i++) {
	    	   for(int j=n;j>=i;j--) {
	    		   System.out.print(" - ");
	    	   }
	    			  for(int k=1;k<=2*i-1;k++) {
	    				  System.out.print(" $ ");
	    			   }
	    		   System.out.println();
	    	   }
	       }
}
