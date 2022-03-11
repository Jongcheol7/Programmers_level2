package coding;

public class ÄûÁî09_Ä«Æê {

	public static void main(String[] args) {
		Solution09 sol = new Solution09();
		sol.solution(24, 24);
	}

}
class Solution09 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int realWid = 0;
        int realHei = 0;
        
        for(int wid=1; ; wid++) {
        	int hei = 0;
        	if(yellow % wid == 0) {
        		hei = yellow / wid;
        		if(brown == ((wid+2)*2 + (hei*2))){
        			realWid = hei+2;
        			realHei = wid+2;
        			break;
        		}
        	}
        }
        
        answer[0] = realWid;
        answer[1] = realHei;
        
        return answer;
    }
}