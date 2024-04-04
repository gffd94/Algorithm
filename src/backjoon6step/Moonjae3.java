package backjoon6step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Moonjae3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] Num = new int[9][9];
		int max = 0;
		int num1 = 0;
		int num2 = 0;

		
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				Num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if(Num[i][j] > max -1) {
					max = Num[i][j];
					num1 = i+1;
					num2 = j+1;
				}
			}
		}
		
		System.out.print(max);
		System.out.println();
		System.out.print(num1+ " "+ num2);
		
	}
}
