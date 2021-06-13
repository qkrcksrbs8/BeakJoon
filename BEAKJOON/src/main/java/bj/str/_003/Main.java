package bj.str._003;

 
public class Main {
	
	public static void main(String[] args) {
		solution(3,12);
	}
	
	 public static int[] solution(int n, int m) {
	        return gdc(n,m);
	    }
	    
	    public static int[] gdc(int n, int m){
	        int o = n;    
	        int p = m;
	        while (m != 0){
	            int l =  n % m;
	            n = m;
	            m = l;
	        }
	        o = o*p/n;
	        int[] answer = new int[2];
	        answer[0] = n;
	        answer[1] = o;
	        System.out.println(n);
	        System.out.println(o);
	        return answer;
	    }
	    
}
 