import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11052 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] P = new int[N+1];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 1; i <= N; i++) {
            P[i] = Integer.parseInt(st.nextToken());
        }
        
        System.out.println(maxCost(P, N));
    }
    
    private static int maxCost(int[] P, int N) {
        int[] dp = new int[N+1];
        
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], P[j] + dp[i-j]);
            }
        }
        return dp[N];
    }
}

/*
 * 카드 N개 구매시 최대 값을 구하는 것.
 * 만약 3개를 구매한다고, 하고, p1 = 10, p2 = 15, p3 = 20이라면. 
 * p1을 3개 사거나, p1 + p2 = 25, p3 = 20임으로 p1을 3개 사는 것이 최대 값이 됨. 
 * 
 * /
 */

