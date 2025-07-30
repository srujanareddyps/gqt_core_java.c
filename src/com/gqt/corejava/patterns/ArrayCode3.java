package com.gqt.corejava.patterns;

import java.util.Scanner;

public class ArrayCode3 {
String arr[][];
Scanner sc=new Scanner(System.in);


void createArray() {
System.out.println("Enter the class count:");
int cls=sc.nextInt();
int stu=sc.nextInt();
arr=new String[cls][stu];
System.out.println("Array created");
System.out.println("----------------");
}
void collectData() {
for(int i=0; i<arr.length;i++){
	System.out.print("Inside the class no:"+(i+1));
	for(int j=0; j<arr[i].length;j++) {

	System.out.println("enter the name  of students no:"+(j+1));
	arr[i][j]=sc.next();
}
	
}
System.out.println("Data created");
System.out.println("----------------");

}
void displayData() {
for(int i=0; i<arr.length;i++){
	System.out.println("Inside the class no:"+(i+1));
	for(int j=0; j<arr[i].length;j++) {
		System.out.println("enter the name  of students no:"+(j+1)+ "is=" +arr[i][j]);
	}
}

System.out.println("----------------");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCode3 ao=new ArrayCode3();
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}

}