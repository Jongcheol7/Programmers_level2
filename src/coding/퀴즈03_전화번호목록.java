package coding;

import java.util.HashMap;

public class ����03_��ȭ��ȣ��� {
	public static void main(String[] args) {
		Solution03 sol = new Solution03();
		String[] str = {"119","97674223","1195524421"};
		
		boolean res = sol.solution(str);
		System.out.println(res);
	}
	

}
class Solution03 {
    public boolean solution(String[] phone_book) {
    	
    	// 1. HashMap�� �����
    	HashMap<String, Integer> map = new HashMap<>();
    	for(int i=0; i<phone_book.length; i++) {
    		map.put(phone_book[i], 1);
    	}
    	
    	// ��� ��ȭ��ȣ�� ���ξ HashMap�� �ִ��� Ȯ���Ѵ�.
    	for(int i=0; i<phone_book.length; i++) {
    		for(int j=1; j<phone_book[i].length(); j++) {
    			if(map.containsKey(phone_book[i].substring(0, j))) {
    				return false;
    			}
    		}
    	}
 
        return true;
    }
}