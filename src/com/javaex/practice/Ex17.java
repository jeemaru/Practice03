package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
			int no = sc.nextInt();
			
			for(int i=1; i<=no; i++) {
				System.out.print("-");
				for(int j=i; j<=no; j++) {
					System.out.print("*");
				}System.out.println("");
				} 
			
				
				
				
		sc.close();
		

		

	}

}
