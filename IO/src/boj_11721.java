import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11721 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int len = s.length()/10;
		
		for(int i =0; i<len; i++) {
			System.out.println(s.substring(i*10, i*10+10));
		}
		System.out.println(s.substring(len*10));
	}
}
