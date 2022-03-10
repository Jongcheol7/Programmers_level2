package coding;

import java.util.HashMap;
import java.util.Iterator;

public class ƒ˚¡Ó04_¿ß¿Â {

	public static void main(String[] args) {
		Solution04 sol = new Solution04();
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		System.out.println(sol.solution(clothes));
	}

}
class Solution04 {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<clothes.length; i++) {
        	String type = clothes[i][1];
        	map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        Iterator<Integer> iter = map.values().iterator();
        while(iter.hasNext()) {
        	answer = answer * ( iter.next().intValue() + 1);
        }

        return answer;
    }
}