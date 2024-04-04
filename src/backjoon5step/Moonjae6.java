package backjoon5step;

import java.util.Scanner;

public class Moonjae6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		int repeat;
		String str;
		
		for (int i = 0; i < Num; i++) {
			repeat = sc.nextInt();
			str = sc.next();
			
			for (int j = 0; j < str.length(); j++) {
				for (int j2 = 0; j2 < repeat; j2++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
