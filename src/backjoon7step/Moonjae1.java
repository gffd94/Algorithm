package backjoon7step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Moonjae1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int row = 1;
		
		int start = 2;
		int end = 7;
		
		while (true) {
			if( N == 1) {
				System.out.println(row);
				break;
			}
			if( N >= start && N <= end) {
				row++;
				System.out.println(row);
				break;
			}
			row++;
			start = end+1;
			end = 6*row + end;
		}
	}
}
