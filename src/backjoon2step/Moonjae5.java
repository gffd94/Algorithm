package backjoon2step;

import java.util.Scanner;

public class Moonjae5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		
			if( H == 0 && M < 45) {
				int hour = 23;
				int minute = M +15;
				System.out.println(hour + " " + minute);
			}else if(H == 0 && M >= 45){
				int hour = H;
				int minute = M - 45;
				System.out.println(hour + " " + minute);
			}else if(H !=0 && M < 45) {
				int hour = H -1;
				int minute = M +15;
				System.out.println(hour + " " + minute);
			}else if(H !=0 && M >= 45) {
				int hour = H;
				int minute = M -45;
				System.out.println(hour + " " + minute);
			}
		
		
	}
}
