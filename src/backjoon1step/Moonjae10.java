package backjoon1step;

import java.util.Scanner;

public class Moonjae10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		// 밑에 계산한 결과값에대한 자료형 int가 아니여서 오답이 남.
		int d = (a+b)%c;
		int e = ((a%c) + (b%c))%c;
		int f = (a*b)%c;
		int g = ((a%c) * (b%c))%c;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
