package a_baekjoon.solve.ac_retpeat;

import java.util.*;

public class Q04_25304영수증 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		int cnt = in.nextInt();
		in.nextLine();
		
		String[] arr = new String[2];
		String g = "";
		int a=0, b=0, ans=0;
		for(int i=0; i<cnt; i++) {
			g = in.nextLine();
			arr = g.split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			ans += a*b;
		}
		
		if(price == ans) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

/*
 
*/