package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter the count:");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++) {
    	 for(int j=1;j<=i;j++) {
    		 if(j%2==1) {
    			 System.out.print("1 "); 
    		 }
    	 else {
   		  System.out.print("0 ");
    	 } 
   	  }
     System.out.println();
	}
}
}
	
	
