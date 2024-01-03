
public class add {
	public static void main(String args[]) {
		int n = 1234;
		
		int output = new add1().solution(n);
		
		System.out.println(output);
	}
}

class add1 {
	public int solution(int n) {
		
		int ans = 0;
		String s = Integer.toString(n);
		
		for(int i =0; i<s.length(); i++) {
			ans += Integer.parseInt((String) s.substring(i, i +1));
		}
		
		
		return n;
	}
}

class add2{
	public int solution(int n) {
		int ans = 0;
		
		String s = Integer.toString(n);
		
		for(char c : s.toCharArray()) {
			ans += c - '0';
		}
		// 캐릭터에서 0을 뺴주면 숫자로 바로 바꿄수 있음
		return ans;
	}
}

class add3 {
	public int solution(int n) {
		int ans = 0;
		
		while(n>0) {
			ans += n%10;
			n/=10;
		}
		return ans;
	}
}


class add4{
	public int solution(int n) {
		return n<10 ? n :(n%10) + solution(n/10);
	}
}
