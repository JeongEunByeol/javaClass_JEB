/**
 * 두수를 비교해 최대 공약수를 구하시오
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.130
 */

import java.util.*;
public class Gcd {
	public static void main(String[] args){
		
		int x,y,z;
		System.out.println("두개의 정수를 입력하세요(큰수,작은수)");
		
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		y = input.nextInt();
		
		while(true){
			z=x%y; // 두개의 정수를 입력받아 나눈값의 나머지를 z에 저장
			
			if(z==0) //z가 0이되면 최대 공약수가 구해진것이므로 종료
				break;
			
			x=y; // y를 x에 저장
			y=z; // z를 y에 저장
		}
		
		/* while(y != 0){
		 *  z = x % y;
		 *  x = y;
		 *  y = z;
		 *  }
		 */
		
		System.out.println("최대 공약수는 " + y);
		
	}

}

/* 예를 들어
 * 12   8
 * 12 % 8 = 4
 * 8  % 4 = 0
 * 이므로 최대 공약수는 4
 */
