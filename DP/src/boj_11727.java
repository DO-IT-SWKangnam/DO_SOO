import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11727 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		
		int[] dp = new int[1001];
		
		dp[1] = 1; 
		dp[2] = 3;
		
		for(int i =3; i<=n; i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) & 10007;
		}
		
		System.out.println(dp[n]);
	}
}

/*
 * bottom - up 방식
 * 1*2 2개나 2*2 타일 추가하는 것은 같은 말이기 떄문에 (n-1)*2를 해줘서 문제 해결. 
 */
