package backjoon1step;

import java.util.Scanner;

public class Moonjae9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bisyop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		look = look - sc.nextInt();
		bisyop = bisyop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(look + " ");
		System.out.print(bisyop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);
	}
}
