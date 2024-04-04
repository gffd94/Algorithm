package backjoon5step;

import java.util.Scanner;

public class Moonjae2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		// 입력한 단어의 length말고 String 배열을 생성.
		String[] chars = new String[word.length()];
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			// 문자열 배열에 한글자 씩 잘라서 String으로 형변환
			chars[i] = Character.toString(word.charAt(i));
			count++;
		}
		
		System.out.println(count);
	}
}
