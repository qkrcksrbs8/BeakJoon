package bj.str._1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	/**
	 * 문자열 중복 max
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		BufferedReader br 	= new BufferedReader(new InputStreamReader(System.in));	
		int[] arr 			= new int[26]; // 영문자의 개수는 26개임
		String s 			= br.readLine();
		
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
				continue;
			} 
			arr[s.charAt(i) - 65]++;
			
		}
		
		int max = -1;
		char ch = '?';
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);
	}
}
