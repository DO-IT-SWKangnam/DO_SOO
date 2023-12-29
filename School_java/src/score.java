import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class score {
	public static void main(String args[]) {
		int[] p1 = {80,120,40,40};
		int output = new Solution().solution(p1);
		
		System.out.println(output);
	}
}

class Solution {
	public int solution(int[] scores) {
		int answer = 0; 
			
		/*
		 * 
		 * 
		 * answer += ((float)scores[0]/100 * 30 /100)*100;
		   answer += ((float)scores[1]/160 * 10 /100)*100;
		   answer += ((float)scores[2]/80 * 20 /100)*100;
		   answer += ((float)scores[3]/100 * 40 /100)*100;
		 */
		
		answer += scores[0]*3/10;
		answer += scores[1]/16;
		answer += scores[2]/4;
		answer += scores[3]*2/5;
		return answer;
			
	}
}

/*
 * int를 float로 형변환해서 값을 계산해주고 이후에 소수점을 떨굼. 
 * 타입 형변환에 대해 잘 알고 있는지 평가함.  
 * 아래에 있는 방식으로 문제를 해결하는것이 좋음. 
 */