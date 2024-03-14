package a_baekjoon.solve.ac_retpeat;

import java.util.Scanner;

public class Q09_2438별찍기1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i=1; i<n+1; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
