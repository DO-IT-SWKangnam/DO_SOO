import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1699 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));
    }

    private static int dp(int n) {
        int[] dp = new int[n+1];
        
        for(int i = 1; i <= n; i++) {
            dp[i] = i;
            for(int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j*j] + 1);
            }
        }
        return dp[n];
    }
}

/*
 * bottom-up 
 * 각 수가 1로만 구성될 경우가 최대 크기임으로 dp[i]=i로 두고, dp[i]와 이후 j값을 증가시키면서
 * dp[i] 와 d[[i-j*j의 값을 비교해 최소 값을 dp[i]로 선언
 */
