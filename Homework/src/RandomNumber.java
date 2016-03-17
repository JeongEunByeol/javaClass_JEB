/**
 * 난수의 합 계산하기(난수생성 하는 방법)
 * @author eunbyeol
 * 2016-3-16
 * 책 페이지 p.137~p.138
 */

import java.util.*;

public class RandomNumber {
	public static void main(String[] args){
		
		int x;
		int sum = 0;
		Random rend = new Random();
		
		System.out.println("난수의 갯수:");
		Scanner input = new Scanner(System.in);
		x = input.nextInt();
		
		for(int i=0; i<x; i++){
			int number = rend.nextInt(100);
			sum += number;
		}
		
		System.out.println("난수" + x + "개의 합은" + sum);
		
	}

}
