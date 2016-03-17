/**
 * break문 예제(점수를 입력하여 0보다 작은 숫자가 들어오면 종료 한 후 평균값)
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.141
 */

import java.util.*;

public class Averager {
	public static void main(String[] args){
		
		int total = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("점수를 입력하시오:");
			int grade = input.nextInt();
			if(grade < 0)
				break;
			total += grade;
			count++;
		}
		System.out.println("평균은" + total/count);
	}

}
