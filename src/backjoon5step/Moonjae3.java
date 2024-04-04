package backjoon5step;

import java.util.Scanner;

public class Moonjae3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for (int i = 0; i < Num; i++) {
			String str = sc.next();
			int a = str.length();
			String first = String.valueOf(str.charAt(0));
			String end = String.valueOf(str.charAt(a-1));
			System.out.println(first+end);
		}
	}
}
