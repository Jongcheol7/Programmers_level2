package coding;

public class 퀴즈02_기는개발 {

	public static void main(String[] args) {
		Solution02 sol = new Solution02();
		sol.solution(new int[] {93,30,55}, new int[] {1,30,5});
	}

}
class Solution02 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        
        
        for(int i=0; i<progresses.length; i++){
            answer[i] = (int) Math.ceil(((100-progresses[i]) / (double)speeds[i]));
        }
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
        return null;
    }
}