package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System. in );

	        System.out.println("Enter the number of rows : ");
	        int n = sc.nextInt();

	        for (int i = n; i >= 1; i--) {

	            for (int j = i - 1; j >= 0; j--) {
	                System.out.print(" ");
	            }

	            for (int k = n; k >= i; k--) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }
	    }
	}
