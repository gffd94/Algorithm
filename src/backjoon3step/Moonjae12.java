package backjoon3step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Moonjae12 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int number = Integer.parseInt(br.readLine());
		int a, b, c, d;
		int sum1, sum2;
		int total = number;
		
		int i = 0;
		while(true) {
			a = number/10;
			b = number%10;
			sum1 = a+b;
			
			c = sum1/10;
			d = sum1%10;
			
			sum2 = b*10+d;
			i++;
			if(total == sum2) {
				break;
			}
			number = sum2;
		}
		
		bw.write(""+i);
		bw.flush();
		bw.close();
	}
}
