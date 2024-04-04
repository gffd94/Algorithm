package backjoon3step;

import java.util.Scanner;

public class Moonjae9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int Z = T-1;
		for (int i = 1; i <= T; i++) {
			for (int j = Z; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = i; k > 0 ; k--) {
				System.out.print("*");
			}
			System.out.println("");
			Z--;
		}
	}
}
