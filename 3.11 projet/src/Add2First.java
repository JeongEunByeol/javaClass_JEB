import java.util.Scanner; // Scanner Ŭ���� ����

public class Add2First {
	// ���� �޼ҵ忡������ ������ ���۵ȴ�.
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x;
		int y;
		int sum;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		x = input.nextInt();
		
		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		y = input.nextInt();
		
		sum = x+y;
		
		System.out.println(sum);
		
	}
 
}
