package bj.binarySearch._001;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader in 	= new BufferedReader(new InputStreamReader (System.in));      
        int n 				= Integer.parseInt(in.readLine());
        int[] arr	 		= new int[n];        
        String arrStr 		= in.readLine();   
        StringTokenizer st 	= new StringTokenizer(arrStr);
        int count 			= st.countTokens();
        int m 				= Integer.parseInt(in.readLine());
        arrStr 				= in.readLine();   
        for (int i=0; i<count; ++i)  arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        st 		= new StringTokenizer(arrStr);
        count 	= st.countTokens();
        for (int i=0; i<count; ++i) {
            int index = Arrays.binarySearch(arr, Integer.parseInt(st.nextToken()));
            if (0 > index ) System.out.println("0");
            else  System.out.println("1");
        }		
	}

}
 