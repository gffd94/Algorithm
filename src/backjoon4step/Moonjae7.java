package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Moonjae7 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 과목의 갯수
		int Num = Integer.parseInt(br.readLine());
		// 갯수만큼 받을 점수들을 토큰화 -> 시간절약
		StringTokenizer st = new StringTokenizer(br.readLine());
		// 과목의 갯수만큼 최대범위 배열생성.
		double[] Score = new double[1001];
		double maxScore = 0;
		
		for(int i = 0; i < Num; i++) {
			Score[i] = Double.parseDouble(st.nextToken());
			// 최댓값 구하기 위해 max사용
			maxScore = Double.max(maxScore, Score[i]);
		}
		
		double sum = 0.0;
		for (int i = 0; i < Num; i++) {
			sum += Score[i] / maxScore*100;
		}
		
		double avg = sum/Num;
		
		bw.write(avg+"");
		bw.close();
	}
}
