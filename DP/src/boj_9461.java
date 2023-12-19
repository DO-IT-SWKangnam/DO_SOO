import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_9461 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp(N));
        }
    }
    
    private static long dp(int N) {
        long[] p = new long[N+3];
        p[1] = 1;
        p[2] = 1;
        p[3] = 1;
        
        for(int i = 4; i <= N; i++) {
            p[i] = p[i-2] + p[i-3];
        }
        
        return p[N];
    }
}

/*
 * bottom-up 
 * n이 4이상일때는n(2) + n(3)
 * 그냥 n까지 반복문 써서 값 반환. 
 * /
 */