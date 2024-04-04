package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
;

public class Moonjae1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// br.readLine() => enter로 구분한 입력값
		int N = Integer.parseInt(br.readLine()); // list의 갯수
		
		String[] arr = new String[N]; // 갯수로 배열생성
		
		String list = br.readLine(); // list 목록
		
		String compareNum = br.readLine(); // list와 비교할 문자

		int count = 0; // 일치하는 수
		
		for (int i = 0; i < N; i++) {
			arr = list.split(" ");
			
			if(arr[i].equals(compareNum)) {
				count++;
			}
		}
		
		bw.write(""+count);
		bw.close();
		
	}
}
