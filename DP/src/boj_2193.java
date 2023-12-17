import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_2193 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		System.out.println(dp(n));
	}
	
	private static long dp(int n) {
		int[][] dp = new int[n+1][2];
		
		
		
		dp[1][0] = 0;
		dp[1][1] = 1;
		for(int i=2; i<=n; i++) {
			dp[i][0] = dp[i-1][0] + dp[i-1][1]; // i번째가 0
			dp[i][1] = dp[i-1][0]; // i번째가 1
		}
		return dp[n][0] + dp[n][1];
	}
}

/*
 * bottom-up 방식
 * i번째 자리가 0일 경우에 i-1자리가 0 또는 1인 이친수 뒤에 0을 추가.
 * i번째 자리가 1일 경우에 i-1번째는 무조건 0
 * 이 두가지 경우의 합이 이친수의 갯수 
 */
