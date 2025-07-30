package com.gqt.corejava.patterns;

import java.util.Scanner;

public class ArrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println(" enter the student count: ");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
    System.out.println("Enter the marks of student number "+(i+1));
    arr[i]=sc.nextInt();
    }
    System.out.println("--------");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println("The marks of student number "+(i+1)+" is= "+arr[i]);
    }
	}

}
