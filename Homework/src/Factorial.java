/**
 * 팩토리얼 계산하기
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 P.134
 */


import java.util.*;

public class Factorial {
	public static void main(String[] args){
		int x;
		long fact = 1; // int를 사용할 경우 저장할 공간이 작아서 값이 나오지 않음
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오.");
		x = input.nextInt();
		
		for(int i = 1; i<x; i++)
			fact = fact*i;
		
		System.out.println(x + "!는 " + fact +"입니다.");
		
	}

}
