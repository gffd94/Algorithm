package backjoon3step;

import java.util.Scanner;

public class Moonjae4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		int sum = 0;
		int total = 0;
		
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			sum = a[i]*b[i];
			total += sum;
		}
		
		if(X == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
