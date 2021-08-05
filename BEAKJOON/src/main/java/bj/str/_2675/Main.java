package bj.str._2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 문자열 반복
	 * @param args
	 */
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int k = 0; k < cnt; ++k) {
			String[] reqStrArr = br.readLine().split(" ");
			int loopCnt = Integer.parseInt(reqStrArr[0]);
			String str 	= reqStrArr[1];
			int strCnt 	= str.length();
			
			for (int i = 0; i < strCnt; ++i) {
				for (int j = 0; j < loopCnt; ++j) {
					sb.append(str.charAt(i));
				}//for -3
			}//for -2
			sb.append("\n");
		}//for -1
		System.out.println(sb.toString());
	}
}
