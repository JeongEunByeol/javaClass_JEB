/*
3�� 11�� java�ǽ�(first) 
�ۼ���: ������
5���� ������ �Է¹ް� �ִ�� �ּҸ� ����Ѵ�. 
 */

import java.util.Scanner;

public class HomeWork {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x,i,min=Integer.MAX_VALUE,max=0;
		
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		
		for(i=0; i<5; i++){
			x = input.nextInt();
			if(max<x){
				max=x;
			}
			if(min>x){
				min=x;
			}
		}
	
		System.out.println("�ִ밪��"+max);
		
		System.out.println("�ּҰ���"+min);
	    
	}
}
