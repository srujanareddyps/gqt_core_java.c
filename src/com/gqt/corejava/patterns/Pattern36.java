package com.gqt.corejava.patterns;

import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word to limit the Pattern (In Capitals) : ");

        char c = sc.next().charAt(0);

        for (char i = 'A'; i <= c; i++) {
            
            for (int j = c; j > i; j--) {
                System.out.print(" ");
            }

            for (char k = 'A'; k <= i; k++) {
                System.out.print(k);
            }
            
            for (char l = 'A'; l < i; l++) {
                System.out.print(l);
            }
            
            System.out.println();
        }
    }
}

