/**
 * 짝수, 홀수 구별하기
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.105
 */

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args){
		
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		number = input.nextInt();
		
		if(number % 2 == 0){
			System.out.println("입력된 정수는 짝수입니다.");
		}
		else{
			System.out.println("입력된 정수는 홀수입니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		
		
	}

}
