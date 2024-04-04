package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Moonjae4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = new int[9];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int Max = num[0];
		int count = 1;
		
		for (int i = 0; i < num.length; i++) {
			if(Max < num[i]) {
				Max = num[i];
				count = i+1;
			}
		}
		
		bw.write(Max+"\n"+count);
		bw.close();
	}
}
