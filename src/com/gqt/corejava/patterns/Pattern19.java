package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size:");
       int n=sc.nextInt();
       int k=1;
       for(int i=1;i<=n;i++) {
    	   for(int j=i;j<=n;j++) {
    		   System.out.print(k+" ");
    		   k++;
    	   }
    	   System.out.println();
       }
	}

}
