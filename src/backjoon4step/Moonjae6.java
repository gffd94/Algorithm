package backjoon4step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Moonjae6 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		Integer[] list = new Integer[10];
		
		for (int i = 0; i < 10; i++) {
			list[i] = Integer.parseInt(br.readLine())%42;
		}
		
		/*
		 * HashSet<Integer> 클래스의 생성자를 사용하여 List<Integer>를 Set<Integer>으로 변환합니다. 
		 * 이때, Set 인터페이스는 중복을 허용하지 않는 데이터 구조입니다. 
		 * 따라서 Set<Integer>은 중복된 값을 갖지 않는 정수 형식의 집합(set)을 나타냅니다.
		 * */
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(list));

		int count = set.size();
		
		bw.write(count+"");
		bw.close();
	}
}
