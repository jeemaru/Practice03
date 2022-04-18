package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
			System.out.print("합계:");
			int no = sc.nextInt();
			int z = 0;
			
			for(int i=no; i>0; i--) {
				z = z+i;
			}System.out.println("합계: " +z);
	
			
		sc.close();
			
			
	}
}
