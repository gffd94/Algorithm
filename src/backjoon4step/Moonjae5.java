package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Moonjae5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 순서없는 무작위 배열 생성. 
		List<Integer> allStu = new ArrayList<Integer>();
		for (int i = 0; i < 30; i++) {
			allStu.add(i+1);
		}
		
		int[] Stu = new int[28];
		for (int i = 0; i < Stu.length; i++) {
			Stu[i] = Integer.parseInt(br.readLine());
		}
		// 비교해서 해당되는거 지우기
		for (int i = 0; i < Stu.length; i++) {
			allStu.remove((Integer)Stu[i]);
		}
		// 남은거 출력
		bw.write(allStu.get(0)+"\n"+ allStu.get(1));
		bw.close();
	}
}
