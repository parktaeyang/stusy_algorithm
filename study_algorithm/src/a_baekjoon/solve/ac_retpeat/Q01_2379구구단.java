package a_baekjoon.solve.ac_retpeat;

import java.util.Scanner;

public class Q01_2379구구단 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
