package backjoon6step;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Moonjae1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < C; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int Num = Integer.parseInt(st.nextToken());
			int[] Score = new int[Num];
			double Sum = 0.0;
			double avg = 0.0;
			int count = 0;
			for (int j = 0; j < Score.length; j++) {
				Score[j] = Integer.parseInt(st.nextToken());
			}
			
			for (int j = 0; j < Score.length; j++) {
				Sum += Score[j];
			}
			
			avg = Sum/Num;
			for (int j = 0; j < Score.length; j++) {
				if(Score[j]>avg) {
					count +=1;
				}
			}
			// int형 을 double형으로 형변화해서 출력하기 위해 해당작업.
			double count1 = Double.valueOf(count);
			double Num1 = Double.valueOf(Num);
			
			System.out.printf("%.3f%%\n",(count1/Num1)*100);
			
		}
	}
}
