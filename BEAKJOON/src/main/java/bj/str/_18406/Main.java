package bj.str._18406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	/**
	 * 럭키 스트레이트
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str 	= br.readLine();
		int count 	= str.length();
		int left	= 0;
		int right	= 0;
		for (int i = 0; i < count/2; ++i) {
			left += (str.charAt(i));
		}
		for (int i = count/2; i < count; ++i) {
			right += (str.charAt(i));
		}
		System.out.println((left == right ? "LUCKY":"READY"));
	}
}