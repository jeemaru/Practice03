package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
			int no = sc.nextInt();
			
			for(int i=1; i<=no; i++) {
				for(int j=i; j<=no; j++) {
					System.out.print("*");
				}System.out.println("");
			} 
			for(int i=2; i<=no; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}System.out.println("");
			}
				
				
				
		sc.close();
		

	}

}
