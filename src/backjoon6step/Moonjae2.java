package backjoon6step;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Moonjae2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		int[][] Sum = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stA = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(stA.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			StringTokenizer stB = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(stB.nextToken());
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				Sum[i][j] = A[i][j]+B[i][j];
					System.out.print(Sum[i][j]);
					if(j != M-1) {
						System.out.print(" ");
					}
				}
			System.out.println();
		}

		
		
		
	}
}
