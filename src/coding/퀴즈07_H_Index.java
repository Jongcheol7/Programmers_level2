package coding;

import java.util.Arrays;

public class ДыБо07_H_Index {

	public static void main(String[] args) {
		Solution07 sol = new Solution07();
		int[] arr = {3,0,6,1,5,4};
		int result = sol.solution(arr);
		System.out.println(result);
	}

}
class Solution07 {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        System.out.println(Arrays.toString(citations));
        
        for(int i=citations[citations.length-1]; i>=0; i--) {
        	int up = 0;
        	for(int j=0; j<citations.length; j++) {
        		if(i <= citations[j]) up++;
        	}
        	if((up >= i) && (citations.length-up) <= i) {
        		answer = i;
        		break;
        	}
        }

        
        return answer;
    }
}