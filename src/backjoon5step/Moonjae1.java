package backjoon5step;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Moonjae1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();
		// Ascii 코드 사용법
		byte[] ascii = input.getBytes(StandardCharsets.US_ASCII);
		
		System.out.println(ascii[0]);
	}
}

