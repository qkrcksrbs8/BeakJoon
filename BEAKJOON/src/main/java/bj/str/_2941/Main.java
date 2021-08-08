package bj.str._2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
	
	/**
	 * 글자 수 반환
	 * @param str
	 * @return
	 */
	public static int getDial(String str) {
		int len = str.length();
		int count = 0;
		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if(ch == 'c' && i < len - 1) {
				if(str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {		
					i++;		
				}
			}
			else if(ch == 'd' && i < len - 1) {
				if(str.charAt(i + 1) == '-') {
						i++;
					}
				else if(str.charAt(i + 1) == 'z' && i < len - 2) {
					if(str.charAt(i + 2) == '=') {
						i += 2;
					}
				}
			}
			else if((ch == 'l' || ch == 'n') && i < len - 1) {
				if(str.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if((ch == 's' || ch == 'z') && i < len - 1) {
				if(str.charAt(i + 1) == '=') {
					i++;
				}
		    }
			count++;
		}
		return count;
	}
	
	/**
	 * 크로아티아 알파벳
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getDial(br.readLine()));
	}
}
