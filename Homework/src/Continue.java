/**
 * continue문 예제 (문자 n 이 나타는 횟수를 카운팅한후 현재 문자가 n이 없으면 루프 동작 , n이 있으면 종료)
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.142~p.143
 */

import java.util.*;

public class Continue {
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("문장을 하나 입력해 주세요");
		String x = input.nextLine();
		
		int n = 0;
		
		for(int i=0; i<x.length(); i++){ // 입력받은 문자열 x의 길이 - x.length()
			if(x.charAt(i) != 'n') // 문자열이 들어가 있는 x의 변수에서 i번째에 있는 문자가 n인지 아닌지 판단
				continue; // 건너 뛰다
			n++;
		}
		System.out.println("문장에서 발견된 n의 갯수는:" + n);
	}

}
