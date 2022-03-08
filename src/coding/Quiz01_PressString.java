package coding;

import java.util.ArrayList;
import java.util.List;

public class Quiz01_PressString {

	public static void main(String[] args) {
		Solution01 sol = new Solution01();
		sol.solution("aabbaccc");
	}

}
class Solution01 {
    public int solution(String s) {
        int answer = 0;
        List<String> list = new ArrayList<String>();
        int result = 0;
        
        for(int i=1; i<=s.length(); i++) {
        	list.add(s.substring(i-1, i));
        }
        System.out.println(list);
        
        for(int k=1; k<list.size(); k++) {
        	int cnt = 0;
        	if(list.get(k).equals(list.get(k-1)) ) {
        		list.remove(k-1);
        		cnt++;
        		k--;
        	}else {
        		list.add(k, Integer.toString(cnt));
        	}
        }
        result = list.size();
        
        System.out.println(result);
        System.out.println(list);
        
        return answer;
    }
}