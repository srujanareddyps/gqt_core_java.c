package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     System.out.print("Enter number of rows: ");
	     int n = sc.nextInt();
	     char ch='A';
	     for (int i = 1; i <= n; i++) {
	         for (int j = 1; j <= n - i; j++) {
	             System.out.print(" ");
	         }
	         for (int k = 1; k <= (2 * i - 1); k++) {
	             System.out.print(ch);
	         }
	         ch++;
	         System.out.println();
	     }
	 }
	}
	

