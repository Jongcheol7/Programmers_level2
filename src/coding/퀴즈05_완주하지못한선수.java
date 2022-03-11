package coding;

import java.util.HashMap;

public class 퀴즈05_완주하지못한선수 {

	public static void main(String[] args) {
		Solution05 sol = new Solution05();
		String participant[] = {"leo","kiki","eden"};
		String completion[] = {"eden", "kiki"};
		String answer = sol.solution(participant, completion);
		System.out.println(answer);
	}

}
class Solution05{
	public String solution(String[] participant, String[] completion) {
    	String answer = "";
    	HashMap<String, Integer> map = new HashMap<>();
    	for(int i=0; i<participant.length; i++) {
    		map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
    	}
    	for(int j=0; j<completion.length; j++) {
    		map.put(completion[j], map.get(completion[j])-1);
    	}
    	for(String key : map.keySet()) {
    		if(map.get(key) != 0) {
    			answer = key;
    		}
    	}
    	    	
    	System.out.println(answer);
    	return answer;
    }
}