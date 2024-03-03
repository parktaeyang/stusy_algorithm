package a_baekjoon.solve.ac_retpeat;

import java.util.Scanner;

public class Q05_24314longint {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();

		int a = n/4;
		String ans = "";
		for(int i=0; i<a; i++) {
			ans += "long ";
		}
		ans += "int";
		System.out.println(ans);
	}
}
