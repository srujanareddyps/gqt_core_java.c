package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the size:");
	      int n=sc.nextInt();
	      int k=n*n;
	      for(int i=1;i<=n;i++) {
	    	  for(int j=1;j<=n;j++) {
	    		  System.out.print(k+"  ");
	    		  k--;
	    	  }
	    	  System.out.println();
	      }
		}

	}
	


