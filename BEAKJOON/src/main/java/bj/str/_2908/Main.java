package bj.str._2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	
	/**
	 * 상수 뒤집기
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int x = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int y = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());		
		System.out.print(x > y ? x:y);		
	}
}
