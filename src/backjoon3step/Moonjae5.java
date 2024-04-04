package backjoon3step;

import java.io.*;
import java.util.StringTokenizer;

public class Moonjae5 {
	public static void main(String[] args) throws IOException {
		/* 
		 * BufferedReader : Scanner 와 유사
		 * * Enter로만 경계를 인식, 받은 데이터는 String 타입
		 * * 다른 타입으로 사용시 형변화을 해줘야함.
		 * 
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		 * * new InputStreamReader(System.in)은 console창에 입력하기위해 사용.
		 * * 사용시 throws IOException 예외처리를 꼭 해줘야함.
		 * * 입력해서 받은 데이터는 line단위로 나눠지기때문에 공백단위로 하기위해 StringTokenizer를 사용.
		 * 
		 * StringTokenizer
		 * * 문자열을 토큰화한다 토막낸다.
		 * * nextToken() 함수를 통해 readLine을 통해 입력받은 값을 공백단위로 구분 / 구분자 있으면 구분자를 기준으로 구분.
		 * 
		 * BufferedWriter : System.out.printLn() 과 유사
		 * * 버퍼를 잡아놓은것.
		 * 
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // 선언
		 * * new OutputStreamWriter(System.out)은 읽은 작업을 출력.
		 * * flush, close 함수를 호출해 뒤처리를 해줘야함.
		 * * write() : 버퍼에 있는 값 전부 출력
		 * * flush() : 남아있는 데이터를 모두 출력.
		 * * close() : 스트림을 닫음.
		 * 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			
			bw.write(num1 + num2 +"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
