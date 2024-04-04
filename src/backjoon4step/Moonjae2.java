package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Moonjae2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); // 정수 N개
		int X = Integer.parseInt(st.nextToken()); // 비교수 X
		
		String list = br.readLine(); // list 목록
		
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(list.split(" ")[i]);
			if( X > a) {
				bw.write(a+" ");
			}
		}
		
		bw.close();
	}
}
