package backjoon5step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Moonjae4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Count = Integer.parseInt(br.readLine());
		// 입력한 문자열
		String letter = br.readLine();
		// 입력한 문자열을 하나씩 쪼개서 넣을 배열
		String[] chars = new String[letter.length()];
		// 쪼개서 넣은 배열을 int로 바꿀 배열
		int[] a = new int[Count]; 
		
		int sum = 0;
		
		for (int i = 0; i < Count; i++) {
			// letter문자열을 하나씩 쪼개서 chars에 담기
			chars[i] = Character.toString(letter.charAt(i));
			// 그것을 int로 형변환
			a[i] = Integer.parseInt(chars[i]);
			//계산
			sum +=a[i];
		}
		
		bw.write(sum+"");
		bw.close();
	
	}
}
