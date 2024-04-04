package backjoon5step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Moonjae10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String alpha = br.readLine().toUpperCase();
		char[] arr = alpha.toCharArray(); // 입력받은 문자를 한글자씩 잘라서 매열에 집어넣음. 문자를 숫자로 생각해서 풀어야함.
		int[] Num = new int[arr.length]; 

		int Count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			Num[i] = arr[i]-'A'+1; // 입력받은 문자를 A:1~Z:26으로 변환해서 Num 배열에 집어 넣음.
									// 아스키코드 A =65를 이용 ( 입력받은 문자 - 65 +1 )로 1~26 이 A~Z 로 매칭.
			if(1 <= Num[i] && Num[i] <=3) {
				Count = Count +3;	
			}else if(4 <= Num[i] && Num[i] <=6) {
				Count = Count +4;
			}else if(7 <= Num[i] && Num[i] <=9) {
				Count = Count +5;
			}else if(10 <= Num[i] && Num[i] <=12) {
				Count = Count +6;
			}else if(13 <= Num[i] && Num[i] <=15) {
				Count = Count +7;
			}else if(16 <= Num[i] && Num[i] <=19) {
				Count = Count +8;
			}else if(20 <= Num[i] && Num[i] <=22) {
				Count = Count +9;
			}else if(23 <= Num[i] && Num[i] <=26) {
				Count = Count +10;
			}
	
		}

		bw.write(Count+"");
		bw.close();
		
	}
}
