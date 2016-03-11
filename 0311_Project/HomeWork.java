/*
3월 11일 java실습(first) 
작성자: 정은별
5개의 정수를 입력받고 최대와 최소를 출력한다. 
 */

import java.util.Scanner;

public class HomeWork {
	
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		int x,i,min=Integer.MAX_VALUE,max=0;
		
		System.out.print("숫자를 입력하시오: ");
		
		for(i=0; i<5; i++){
			x = input.nextInt();
			if(max<x){
				max=x;
			}
			if(min>x){
				min=x;
			}
		}
	
		System.out.println("최대값은"+max);
		
		System.out.println("최소값은"+min);
	    
	}
}
