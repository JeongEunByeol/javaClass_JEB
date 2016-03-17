/**
 * 숫자 추측 게임 변형 (while문을 사용하기 / 정답인 숫자는 매번 1~100까지의 난수를 발생)
 * @author eunbyeol
 * 2016-3-16
 * 책에는 없고 교수님 주신 과제
 */

import java.util.*;

public class NumberGameModify {
	public static void main(String[] args){
		Random s = new Random();
		
		int number = s.nextInt(100+1); // 1부터 100까지의 랜덤 정수값을 정답으로 받는다	    
		int guess; // 사용자가 입력할 정수
	    Scanner sc = new Scanner(System.in); //사용자가 입력한 숫자를 입력받을 수 있는 객체 생성
	    
	   System.out.println("정답을 추축하여 보시오:"); // 처음 게임시작 
	   guess = sc.nextInt(); // 처음 추측한값 입력
	    
	    int count = 1; // 사용자가 정답을 맞추기 위해 시도한 횟수 카운팅 1로 시작하는 이유는 위에서 1번 추측값을 받고 틀렸을 때 while문으로 들어가기 때문에 
	    
	    while(guess != number ){
	    	
		    if(guess > number)
		    	System.out.println("추측한 숫자가 정답보다 큽니다." );
		    if(guess < number)
		    	System.out.println("추측한 숫자가 정답보다 작습니다."); // if문 이용해서 정답값보다 큰지 작은지 판단 
		    			
		    System.out.println("정답을 추축하여 보시오:"); // 정답과 같지 않으므로 다시 추측값 받기
		    guess = sc.nextInt(); // 추측값 다시 받기
		    count++; // 다시 추측값을 받았기 때문에 카운팅
		   }
	    System.out.println("축하합니다. 정답입니다. 시도 횟수:" + count + " 정답은" + number); // 정답을 맞춰서 while문에서 나와서 실행
	}

}
