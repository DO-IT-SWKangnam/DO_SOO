import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class boj_11720 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		int sum = 0;
		
		for(byte val : br.readLine().getBytes()) {
			sum += (val - '0');
		}
		
		System.out.println(sum);
	}
}
