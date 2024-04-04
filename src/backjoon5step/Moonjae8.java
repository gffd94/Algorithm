package backjoon5step;

import java.util.Scanner;

public class Moonjae8 {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String words = sc.nextLine();
	
	if(words.equals(" ") || words.equals(null)) {
		System.out.println(0);
	}else {
		int Num = 0;
		String letter[] = words.trim().split(" ");
		for (int i = 0; i < letter.length; i++) {
			Num++;
		}
		System.out.println(Num);
	}
		
	}
	
}
