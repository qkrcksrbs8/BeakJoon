package bj.str._11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 숫자의 합
	 * @param args
	 */
	public static void main(String[] args) throws IOException {		
		BufferedReader br 	= new BufferedReader(new InputStreamReader(System.in));
		int cnt 			= Integer.parseInt(br.readLine());
		String[] arr 		= br.readLine().split("");
		int sum 			= 0;
		for (int i = 0; i < cnt; ++i) {
			sum += Integer.parseInt(arr[i]);
		}
		System.out.print(sum);
	}
}
