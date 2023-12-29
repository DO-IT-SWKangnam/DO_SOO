import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class divisor {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(div(n));
	}
	
	
	public static int div(int n) {
		int sum = 0;
		for(int i =1; i<=n; i++) {
			if(n%i==0)
				sum +=i;
		}
		
		return sum;
	}
}



/*
 * 주어진 n까지 for문으로 돌려서, 나눠서 떨어지는지를 확인. --> %연산자 사용. 4/2 = 2, 4/3 = 1, 4%3 = 1, 
 */