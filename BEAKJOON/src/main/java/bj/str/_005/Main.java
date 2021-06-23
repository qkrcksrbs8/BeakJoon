package bj.str._005;

 
public class Main {
	
	public static void main(String[] args) {
		
		int n = 15;
		int answer = 1;
        double x = (double)(n / 2)+1;
        int y = (int)x;
        for (int i = y; i > 0; --i){
            int k = 0;
            for (int j = i; j > 0; --j){
                if (n < k) {
                	j = 0;
                    continue;
                }
                k += j;
                if (n == k) {
                   ++answer; 
                }            
            }
        }
		System.out.println(answer);
		
	}
	
	    
}
 