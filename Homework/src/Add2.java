/**
 * 입력과 출력 연습
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.92
 */

import java.util.Scanner; // Scanner 라는 클래스를 포함

public class Add2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); // 객체를 생성해서 input이라는 공간에 넣어줌
		int x;
		int y;
		int sum;
		
		System.out.println("첫번째 숫자를 입력하시오");
		x = input.nextInt();
		
		System.out.println("두번째 숫자를 입력하시오");
		y = input.nextInt();
		
		sum = x + y;
		
		System.out.println(sum);
		
		
		}
}
