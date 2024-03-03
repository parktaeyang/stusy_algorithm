package a_baekjoon.solve.ac_retpeat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q06_15552빠른반복더하기 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
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
			bw.write(String.valueOf(ans));
			bw.newLine();
		}
		bw.flush();

	}

}
