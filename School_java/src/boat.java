import java.util.Arrays;

public class boat {
	public static void main(String args[]) {
		int[] p1 = {70,50,80,50};
		int limit = 100;
		
		int output = new boat1().solution(p1, limit);
		
		System.out.println(output);
	}
}


class boat1 {
	public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int i = 0, j = people.length - 1;
        int answer = 0;
        
        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
            answer++;
        }
        
        return answer;
    }
}