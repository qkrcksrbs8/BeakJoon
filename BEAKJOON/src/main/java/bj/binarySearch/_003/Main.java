package bj.binarySearch._003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	private static int[] cards;
	private static int[] numbers;
	public static void main(String[] args) throws NumberFormatException, IOException {
		bufferedRead();
		Arrays.sort(cards);
		StringBuilder sb = new StringBuilder();
		for (int num : numbers) {
			sb.append(find(num)).append(" ");
		}
		System.out.println(sb.toString());
	}
	
	private static int find(int num) {
		int left = findLeft(cards, 0, cards.length, num);
		int right = findRight(cards, 0, cards.length, num);
		return right - left;
	}
	
	private static int findLeft(int[] arr, int left, int right, int num) {
		int index = (left + right) / 2;
		if(left >= right) {
			return index;
		}
		if( arr[index] >= num ) {
			return findLeft(arr, left, index, num);
		}else {
			return findLeft(arr, index + 1, right, num);
		}
	}
	
	private static int findRight(int[] arr, int left, int right, int num) {
		int index = (left + right) / 2;
		if(left >= right) {
			return index;
		}
		if( arr[index] <= num ) {
			return findRight(arr, index + 1, right, num);
		}else {
			return findRight(arr, left, index, num);
		}
	}
	
	private static void bufferedRead()  throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		String[] inputCards = reader.readLine().split(" ");
		int m = Integer.parseInt(reader.readLine());
		String[] inputNums = reader.readLine().split(" ");	
		cards = new int[n];
		numbers = new int[m];
		for (int i = 0; i < inputCards.length; i++) {
			cards[i] = Integer.parseInt(inputCards[i]);
		}
		for (int i = 0; i < inputNums.length; i++) {
			numbers[i] = Integer.parseInt(inputNums[i]);
		}
	}
}


//import java.util.Scanner;
//public class Main {
//	public static void main(String[] args) {
//		Scanner sc 	= new Scanner(System.in);
//		int N 		= sc.nextInt();
//		StringBuilder sb = new StringBuilder();
//		int[] card 	= new int[20000001];
//		for (int i = 0; i < N; ++i) ++card[sc.nextInt()+10000000] ;	
//		int M = sc.nextInt();
//		for (int i = 0; i < M; ++i) sb.append(card[sc.nextInt()+10000000]+" ");	
//		System.out.println(sb.toString());
//	}
//}
 