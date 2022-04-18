package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
			System.out.print("숫자:");
			long no = sc.nextLong();
			long z = 1;
			
			for (long i=no; i>0; i--) {
				z = i*z;
			}System.out.println("결과값: "+(long)z);
			
			
			
		
		
		
		sc.close();	
		
		

	}

}
