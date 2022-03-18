package coding;

import java.util.ArrayList;
import java.util.List;

public class 퀴즈02_기능개발 {

	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		sol.solution(new int[] {93,30,55}, new int[] {1,30,5});
	}

}
class Solution02 {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<Integer>();
        int[] dayArr = new int[100];
        
        int day = 1;
        for(int i=0; i<progresses.length; i++) {
        	while(progresses[i] + day*speeds[i] < 100) {
        		day++;
        	}
        	dayArr[day]++;
        }
        
        for(int num : dayArr) {
        	if(num != 0) {
        		list.add(num);
        		//System.out.println(num);
        	}
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}