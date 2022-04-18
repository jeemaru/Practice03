package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
			int no = sc.nextInt();
			int z = 0;
			
			System.out.println("5의 배수의 개수:"+ no/5);
			for(int i=0; i<=no/5; i++) {
				z = z+5*i;
				} System.out.println("5의 배수의 합:"+(z));
			
		sc.close();
		
		
	}

}
