package backjoon1step;

import java.util.Scanner;

public class Moonjae11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 세자리수 세자리수 곱셈에서 각 자리수의 곱을 나머지와 몫의수로 구분해서 계산처리를 함.
		System.out.println(a*(b%10));
		System.out.println(a*(b%100/10));
		System.out.println(a*(b/100));
		System.out.println(a*b);
	}
}
