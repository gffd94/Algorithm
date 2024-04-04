package backjoon2step;

import java.util.Scanner;

public class Moonjae6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int time = sc.nextInt();
		int N = (time+M)/60;
		int S = (time+M)%60;

			if(time+M >= 60) {
				int hour = (H +N)%24;
				int minute = S; 
				System.out.println(hour + " " + minute);
			}else {
				int hour = H%24;
				int minute = time + M;
				System.out.println(hour + " " + minute);
			}
		
	}
}
