package backjoon5step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Moonjae5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String word = br.readLine();
		// 입력받을 문자 최대 범위 배열
		String[] chars = new String[101];
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		// 알파벳 length 만큼 배열 한글자 씩 담아둘 배열
		String[] alpha = new String[26];
		// 입력한 문자 한글자 씩 담기
		for (int i = 0; i < word.length(); i++) {
			chars[i] = Character.toString(word.charAt(i));
		}
		// 알파벳 한글자 씩 담기
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = Character.toString(alphabet.charAt(i));
			
		}
		// 알파벳 문자와 입력받은 문자들 비교
		for (int i = 0; i < alpha.length; i++) { // 비교 대상 범위만큼 먼저 for문
			boolean check = true; // 두문자가 동일한지 여부 (필수! 체크할 기준이 필요함)
			for (int j = 0; j < word.length(); j++) { // 비교할 대상만큼 for문
				check = alpha[i].equals(chars[j]); // 두개 일치 여부
				if(check == true) {
					bw.write(j+" "); // 일치하면 알파벳 index 번호 출력
					break;
				}
			}
			if(check == false) {
				bw.write("-1 "); // 일치하지 않으면 -1 출력
			}
		}
		
		bw.close();
		
	}
}
