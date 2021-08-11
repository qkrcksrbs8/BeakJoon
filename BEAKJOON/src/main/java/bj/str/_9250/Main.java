package bj.str._9250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	
	static int oneSoCnt = 0;
	
	/**
	 * YES, NO 반환
	 * @param str
	 * @param arr
	 * @param count
	 * @return
	 */
	public static String isYes(String str, String[] arr) {
		for (int i = 0; i < oneSoCnt; ++i) {
			if (-1 < str.indexOf(arr[i])) {
				return "YES";
			};
		}
		return "NO";
	}
	/**
	 * 문자열 집합 판별
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br 	= new BufferedReader(new InputStreamReader(System.in));
		oneSoCnt 			= Integer.parseInt(br.readLine());
		String[] oneSoArr 	= new String[oneSoCnt];	
		for (int i = 0; i < oneSoCnt; ++i) {
			oneSoArr[i] = br.readLine();
		}
		
		int strCnt 			= Integer.parseInt(br.readLine());
		StringBuilder sb 	= new StringBuilder();	
		for (int i = 0; i < strCnt; ++i) {
			sb.append(isYes(br.readLine(), oneSoArr)).append("\n");
		}
		System.out.print(sb.substring(0,sb.length()-1));	
	}
}
