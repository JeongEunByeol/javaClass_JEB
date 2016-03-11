import java.util.Scanner; // Scanner 클래스 포함

public class Add2First {
	// 메인 메소드에서부터 실행이 시작된다.
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = input.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오: ");
		y = input.nextInt();
		
		sum = x+y;
		
		System.out.println(sum);
		
	}
 
}
