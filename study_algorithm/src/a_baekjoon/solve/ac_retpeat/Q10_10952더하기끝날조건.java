package a_baekjoon.solve.ac_retpeat;

import java.util.HashMap;
import java.util.Scanner;

public class Q10_10952더하기끝날조건 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashMap<Integer, String> arr = new HashMap<Integer, String>();
		String[] arr2 = null;
		int a = 0;
		while(true){
			arr.put(a, in.nextLine());
			arr2 = arr.get(a).split(" ");
			if(arr2[0].equals("0") && arr2[1].equals("0")) {
				arr.remove(a);
				break;
			}
			a++;
		}
		
		arr2 = null;
		for(int i=0; i<arr.size(); i++) {
			arr2 = arr.get(i).split(" ");
			System.out.println(Integer.parseInt(arr2[0]) + Integer.parseInt(arr2[1]));
		}

	}

}
