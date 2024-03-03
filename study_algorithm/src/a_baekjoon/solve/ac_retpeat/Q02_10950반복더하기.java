package a_baekjoon.solve.ac_retpeat;

import java.util.*;

public class Q02_10950반복더하기 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arrn = new int[n];
		
		in.nextLine();
		for(int i=0; i<n; i++) {
			String s = in.nextLine();
			String arr[] = s.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			arrn[i] = a+b;
			
		}

		for(int ans : arrn) {
			System.out.println(ans);
		}
	}

}
