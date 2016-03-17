/**
 * 인사말 출력하기 ( 현재시간 출력후 현재시간 판단해서 그에 맞는 인사말 출력하기 )
 * 객체 잘 알아두기!!
 * @author eunbyeol 
 * 2016-3-16
 * 책 페이지 p.112
 */

import java.util.Date;

public class Welcome {
	public static void main(String[] args){
	
		Date date = new Date();
		int currentHour = date.getHours();
		System.out.println("현재시간은" + date);
		if(currentHour < 11){
			System.out.println("Good morning");
		}
		else if(currentHour < 15){
			System.out.println("Good afternoon");
		}
		else if(currentHour < 20){
			System.out.println("Good evening");
		}
		else {
			System.out.println("Good night");
		}
		
		
	}
}
