import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9095 {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(dp(n));
		}
	}

	private static int dp(int n) {
		int[] dp = new int[11];
		
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		
		for(int i =4; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		return dp[n];
	}
}

/* bottom-up 방
 * 경희가 함수 따로 써서 풀길래 나도 함수 따로 만들어서 풀어봄. 
 * 문제에서 주어진 1,2,3의 합으로 n을 나타내는 방식 갯수를 알기 위해선, 
 * n이 1,2,3일때의 경우를 나눠서 접근 1 => 1, 2=>2 , 3=>4가지의 경우의 수가 필요. 
 * 이를 통해서, n이 4일때는n-1 + n-2 + n-3의 값을 합산해주면 결과 도출 가능. 
 */
