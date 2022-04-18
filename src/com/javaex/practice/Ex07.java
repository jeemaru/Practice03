package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int i = sc.nextInt();
		
		
		for(int n=1; n<=i; n++) {
			for(int x=1; x<=n; x++) {
				System.out.print(i);
			}System.out.println("");
		}
		
			
			
		sc.close();
	}

}
