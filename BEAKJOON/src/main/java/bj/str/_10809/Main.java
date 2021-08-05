package bj.str._10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * 알파벳찾기
	 * @param args
	 */
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.	
		StringBuilder sb = new StringBuilder();
		for(char i = 'a'; i <= 'z'; ++i) {
			sb.append(str.indexOf(i)).append(" ");
        }
		System.out.println(sb.toString().substring(0,sb.length()-1));
	}
}
