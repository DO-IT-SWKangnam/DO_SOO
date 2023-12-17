import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11726 {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int n  = Integer.parseInt(br.readLine());
		
		int[] dp = new int[1001]; 
		
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i =3; i<=n; i++) {
			dp[i] = (dp[i - 1] + dp[i-2]) % 10007;
		}
		
		
		System.out.println(dp[n]);
	}
	
	/*
	 * bottom - up 방식 - 작은 값부터 해결.
	 * 2*i 직사각형 갯수 구하는 거니깐, 2*1일떄는 1개, 
	 * 2*2일때는 2개가, 2*3일때는 2*2 + 2*1 = 3개가
	 * 2*4일떄는 2*3 + 2*2 = 5개가 필요하게 됨
	 */
	
	
}
