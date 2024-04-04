package backjoon3step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Moonjae10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			// StringTokenizer를 while 내부에 써줘야 계속 bufferedReader로 들어온값을 토큰으로 사용가능
			// 밖에 쓰면 한번만 소모해버리고 토큰이 없어서 오류.
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if( a == 0 && b == 0) {
				break;
			}else {
				bw.write((a+b) + "\n");				
			}
		}
		bw.flush();
		bw.close();
	}
}
