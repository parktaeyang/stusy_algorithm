package a_baekjoon.solve.ac_retpeat;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q0708 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arrn = new String[n];
		
		in.nextLine();
		for(int i=0; i<n; i++) {
			String s = in.nextLine();
			arrn[i] = s;
			
		}
		
		String arr[];
		int a=0, b=0;
		for(int i=0; i<n; i++) {
			arr = arrn[i].split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			bw.write("Case #"+(i+1)+": "+a+" + "+b+" = "+(a+b));
			bw.newLine();
		}
		bw.flush();

	}

}

/*
		in.nextLine();
		for(int i=0; i<n; i++) {
			String s = in.nextLine();
			String arr[] = s.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			arrn[i] = a+b;
			
		}

		for(int i=0; i<n; i++) {
			bw.write("Case #"+(i+1)+": "+String.valueOf(arrn[i]));
			bw.newLine();
		}
		bw.flush();
		
5
1 1
2 3
3 4
9 8
5 2
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
*/