package coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		String answer = "";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i<participant.length; i++) {
			map.put(participant[i], map.getOrDefault(participant[i], 0 )+1);
		}
		for(int j=0; j<completion.length; j++) {
			map.put(completion[j], map.get(completion[j])-1);
		}
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(answer);
	}
}