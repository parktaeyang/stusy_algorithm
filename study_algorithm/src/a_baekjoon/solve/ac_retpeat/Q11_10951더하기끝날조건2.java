package a_baekjoon.solve.ac_retpeat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q11_10951더하기끝날조건2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		HashMap<Integer, String> arr = new HashMap<Integer, String>();
		String[] arr2 = null;
		int a = 0;
		while((input = br.readLine()) != null){
			System.out.println(input);
			
		}
		
		arr2 = null;
		for(int i=0; i<arr.size(); i++) {
			arr2 = arr.get(i).split(" ");
			System.out.println(Integer.parseInt(arr2[0]) + Integer.parseInt(arr2[1]));
		}

	}

}
