package bj.queue._2164;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
 
public class Main {
 
	/**
	 * 카드2
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br	= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> q 	= new LinkedList<>();
		
		for (int i = 1; i <= N; ++i) {
			q.push(N-i+1);			//입력 받은 숫자만큼 queue에 삽입
		}
		
		for (int i = 0; i < N-1; ++i) {
			q.poll();				//제일 위에 있는 숫자 제거
			q.addLast(q.poll());	//제일 위에 있는 숫자 마지막으로 이동
		}
		
		System.out.println(q.poll());//결과
	}
}
