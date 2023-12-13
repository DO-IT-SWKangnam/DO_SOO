import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj_2741 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // 자연수 N을 입력받음

        for(int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
