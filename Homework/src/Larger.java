/**
 * 5개의 정수를 입력 받은뒤 가장 큰수와 가장 작은 수를 출력 하시오.
 * @author eunbyeol
 * 2016-3-16
 * 책에는 없는 내용 실습시간 문제
 */

import java.util.Scanner; 

public class Larger {
	public static void main(String[] args){
		int x;
		int min = Integer.MAX_VALUE;
		int max = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요");
		
		for(int i=0;i<5;i++){
			x = input.nextInt();
			if(x>max)
				max = x;
			if(x<min)//else if를 할 경우 max에 처음 입력된 숫자가 들어가기 때문에 첫번째 숫자에 가장 작은 수가 들어왔을때 삭제되어 원하는 값을 출력할수 없음
				min = x;
			
		}
		System.out.println("입력된 정수중 가장 큰수는 :" + max);
		System.out.println("입력된 정수중 가장 작은 수는:" + min);
		
	}
}
