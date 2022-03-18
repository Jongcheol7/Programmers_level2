package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class 퀴즈06_가장큰수 {

	public static void main(String[] args) {
		Solution06 sol = new Solution06();
		int[] numbers = {6,10,2};
		System.out.println(sol.solution(numbers));
	}

}
class Solution06 {
    public String solution(int[] numbers) {
        String answer = "";
        
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
        	list.add(Integer.toString(numbers[i]));
        }
        
        System.out.println(list);
        
        Collections.sort(list, new Comparator<String>() {
        	public int compare(String s1, String s2) {
        		return (s2+s1).compareTo(s1+s2);
        	}
        });
        
        System.out.println(list);
        
        if(list.get(0).startsWith("0")) {
        	return "0";
        }
        
        for(String str : list) {
        	answer += str;
        }
        
        return answer;
    }
}