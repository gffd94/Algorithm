package backjoon2step;

import java.util.Scanner;

public class Moonjae3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 배수를 구할땐 %숫자==0 으로 사용.
		int year = sc.nextInt();
		if((year%4)==0) {
			if( (year%400)==0 || (year%100)!=0) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
		}else {
			System.out.println("0");
		}
	}
}
