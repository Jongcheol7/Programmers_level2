package coding;

import java.util.HashSet;
import java.util.Iterator;


public class 퀴즈08_소수찾기 {

	public static void main(String[] args) {
		Solution08 sol = new Solution08();
		String number = "011";
		System.out.println(sol.solution(number));
	}

}
class Solution08 {
	HashSet<Integer> set = new HashSet<Integer>();
    public int solution(String numbers) {
        int answer = 0;
        
        
        recursive("", numbers);
        System.out.println(set);
        
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
        	if(isPrime(it.next())) {
        		answer++;
        	}
        }
        
        return answer;
    }
    
    public void recursive(String comb, String others) {
    	if(!comb.equals(""))
    		set.add(Integer.parseInt(comb));
    	
    	for(int i=0; i<others.length(); i++) 
    		recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
    	
    }
    
    public boolean isPrime(int num) {
        if(num == 0) return false;
    	int count = 0;
    	boolean answer = true;
    	for(int i=1; i<=num; i++) {
    		if(num % i == 0) {
    			count++;		
    		}
    	}
    	if(count ==1 || count>2) {
			answer = false;
		}
    	return answer;
    }
}