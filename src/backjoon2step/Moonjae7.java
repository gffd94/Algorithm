package backjoon2step;

import java.util.Scanner;

public class Moonjae7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if( x == y && y == z && x == z) {
			int number = x*1000 + 10000;
			System.out.println(number);
		}else if(x == y || x == z || y == z) {
			if(x == y) {
				int number = x*100 + 1000;
				System.out.println(number);
			}else if (x == z) {
				int number = x*100 + 1000;
				System.out.println(number);
			}else if(y == z){
				int number = y*100 + 1000;
				System.out.println(number);
			}
		}else {
			if( x > y && x > z) {
				int number = x*100;
				System.out.println(number);
			}else if(y > x && y > z) {
				int number = y*100;
				System.out.println(number);
			}else if(z > x && z > y) {
				int number = z*100;
				System.out.println(number);
			}
		}
	}
}
