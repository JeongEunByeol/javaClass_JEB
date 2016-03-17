/**
 * 숫자 추측게임(숫자를 정해 놓고 정해놓은 숫자보다 크거나 작음을 알려주어 정해놓은 숫자를 찾게 해주는 게임)
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.145
 */

import java.util.*;

public class NumberGame {
	public static void main(String[] args){
		int x =60;
		int guess;
		Scanner input = new Scanner(System.in);
		int count = 0;
		
		do{ // 우선 한번 do에 걸리는 문장을 한번 실행한다
		System.out.println("숫자를 추측하여 입력해 주세요.");
		guess = input.nextInt(); // 사용자가 입력하는 숫자를 받는다
		count++; // 시도 횟수 카운트
		
		if(guess > x)
			System.out.println("사용자가 제시한 숫자가 정해진 숫자보다 큽니다.");
		
		if(guess < x)
			System.out.println("사용자가 제시한 숫자가 정해진 숫자보다 작습니다.");
		}while( guess != x); // 위에 있는 문장 실행 후 while에 걸리는 조건문 확인
		
		
		System.out.println("축하합니다 성공입니다. 시도 횟수는 :" + count +"정답은:" + x);
		
	}

}
