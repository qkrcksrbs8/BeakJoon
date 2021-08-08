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
			q.push(N-i+1);
		}
		for (int i = 0; i < N-1; ++i) {
			q.poll();
			q.addLast(q.poll());
		}
		System.out.println(q.poll());
	}
}
