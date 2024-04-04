package backjoon5step;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Moonjae9 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int threeA = A/100;
		int twoA = A%100/10;
		int oneA = A%10;
		int sumA = oneA*100+twoA*10+threeA;
		
		int threeB = B/100;
		int twoB = B%100/10;
		int oneB = B%10;
		int sumB = oneB*100+twoB*10+threeB;
		
		if(sumA > sumB) {
			bw.write(sumA+"");
		}else {
			bw.write(sumB+"");
		}
	
		bw.close();
	}
}
