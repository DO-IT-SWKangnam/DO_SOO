
public class tournament {
	public static void main(String args[]) {
		int p1 = 8;
		int p2 = 4;
		int p3 = 7;
		
		int output = new tournament1().solution(p1, p2, p3);
		
		System.out.println(output);
	}
}

class tournament1{
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}