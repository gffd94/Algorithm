package backjoon5step;

import java.util.Scanner;

public class Moonjae11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) { // 입력만 문자가 있을때 까지 반복.
			String str = sc.nextLine(); //입력받은 문자
			
			if(str.length() > 100) { // 100글자 이상 break
				break;
			}else if(str.isEmpty() || str.substring(0,1).equals(" ") || str.substring(str.length()-1).equals(" ")) { // 문자가 비엇거나, 첫문자, 마지막 문자 공백일 경우 break
				break;
			}
			System.out.println(str);
		}
	}
}
