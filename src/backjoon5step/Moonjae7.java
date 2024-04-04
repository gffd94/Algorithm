package backjoon5step;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Moonjae7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letter = sc.nextLine().toUpperCase();
		char[] alpha = new char[26];
		// Comparator.reverseOrder() 내림차순을 쓰기위해 Integer로 선언.
		Integer[] Num = new Integer[26];
		int max = 0;
		int maxindex = 0;
		
		for(int i=0; i<alpha.length; i++) {
			alpha[i] = (char) (65+i); // 대문자인 알파벳 담기
			Num[i] = 0;
			for(int j=0; j<letter.length(); j++) {
				if(letter.charAt(j) == alpha[i]) {
					Num[i]++;
				}
			}
		}
		
		for(int i=0; i<Num.length; i++) {
			if(max < Num[i]) {
				max = Num[i]; // 최댓값
				maxindex = i; // 최댓값의 index 번호
			}
		}
		// max순으로 내림차순 정렬
		Arrays.sort(Num, Comparator.reverseOrder());
		
		if(Num[0].equals(Num[1])) {
			System.out.println('?');
		} else if(Num[0] != Num[1]) {
			System.out.println(alpha[maxindex]);
		}
		
	}
}
